package com.javatutorialshub.market.service;

import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.entity.Stock;
import com.javatutorialshub.market.exception.CreateStockException;
import com.javatutorialshub.market.exception.UpdateStockException;
import com.javatutorialshub.market.mapper.StockMapper;
import com.javatutorialshub.market.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UpdateStockService {
    private final StockRepository stockRepository;

    @Transactional(rollbackFor = Exception.class)
    public StockDTO update(StockDTO stockDTO) throws UpdateStockException {
        try {
            Stock stock = StockMapper.MAPPER.toStock(stockDTO);
            stock.markNotNew();
            Stock result = stockRepository.save(stock);
            return StockMapper.MAPPER.toStockDTO(result);
        } catch (Exception e){
            String message = "Unable to update the stock due to:" + e.getMessage();
            log.warn(message);
            throw new UpdateStockException(message, e);
        }
    }
}
