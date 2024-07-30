package com.javatutorialshub.market.service;

import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.entity.Stock;
import com.javatutorialshub.market.exception.FindStockByIdException;
import com.javatutorialshub.market.exception.FindStockByNameException;
import com.javatutorialshub.market.exception.StockByNameNotFoundException;
import com.javatutorialshub.market.exception.StockNotFoundException;
import com.javatutorialshub.market.mapper.StockMapper;
import com.javatutorialshub.market.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class FindStockByNameService {
    private final StockRepository stockRepository;

    @Transactional(readOnly = true)
    public Collection<StockDTO> find(String name) throws StockByNameNotFoundException, FindStockByNameException {
        try {
            Collection<Stock> result = stockRepository.findByName(name);
            if(result.isEmpty()) {
                throw new StockByNameNotFoundException("stocks with name:'" + name + "' are not found");
            }
            return StockMapper.MAPPER.toStockDTOs(result);
        } catch (StockByNameNotFoundException e) {
            throw e;
        } catch (Exception e){
            String message = "Unable to find the stocks by name due to:" + e.getMessage();
            log.warn(message);
            throw new FindStockByNameException(message, e);
        }
    }
}
