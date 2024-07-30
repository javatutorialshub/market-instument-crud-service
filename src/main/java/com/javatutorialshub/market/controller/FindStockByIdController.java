package com.javatutorialshub.market.controller;

import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.entity.Stock;
import com.javatutorialshub.market.exception.CreateStockException;
import com.javatutorialshub.market.exception.FindStockByIdException;
import com.javatutorialshub.market.service.CreateStockService;
import com.javatutorialshub.market.service.FindStockByIdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class FindStockByIdController {
    private final FindStockByIdService findStockByIdService;

    @GetMapping("/{id}")
    public StockDTO findStock(@PathVariable("id") Long stockId) throws FindStockByIdException {
        try {
            return findStockByIdService.find(stockId);
        } catch (FindStockByIdException e) {
            throw e;
        } catch (Exception e){
            log.warn("Technical error occurred when attempting to find stock due to: " + e.getMessage());
            throw new FindStockByIdException(e);
        }
    }
}
