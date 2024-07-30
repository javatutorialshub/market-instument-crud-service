package com.javatutorialshub.market.service;

import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.entity.Stock;
import com.javatutorialshub.market.exception.CreateStockException;
import com.javatutorialshub.market.exception.FindStockByIdException;
import com.javatutorialshub.market.exception.StockNotFoundException;
import com.javatutorialshub.market.mapper.StockMapper;
import com.javatutorialshub.market.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FindStockByIdService {
    private final StockRepository stockRepository;

    @Transactional(readOnly = true)
    public StockDTO find(Long id) throws StockNotFoundException, FindStockByIdException {
        try {
            Optional<Stock> result = stockRepository.findById(id);
            if(result.isPresent()) {
                return StockMapper.MAPPER.toStockDTO(result.get());
            } else {
                throw new StockNotFoundException("stock with id:" + id + " is not found");
            }
        } catch (StockNotFoundException e) {
            throw e;
        } catch (Exception e){
            String message = "Unable to find the stock due to:" + e.getMessage();
            log.warn(message);
            throw new FindStockByIdException(message, e);
        }
    }
}
