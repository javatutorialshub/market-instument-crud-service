package com.javatutorialshub.market.service;

import com.javatutorialshub.market.exception.DeleteStockByIdException;
import com.javatutorialshub.market.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class DeleteStockByIdService {
    private final StockRepository stockRepository;

    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) throws DeleteStockByIdException {
        try {
            stockRepository.deleteById(id);
        } catch (Exception e){
            String message = "Unable to delete the stock due to:" + e.getMessage();
            log.warn(message);
            throw new DeleteStockByIdException(message, e);
        }
    }
}
