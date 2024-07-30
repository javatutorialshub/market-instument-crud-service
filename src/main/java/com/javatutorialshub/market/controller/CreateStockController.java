package com.javatutorialshub.market.controller;

import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.exception.CreateStockException;
import com.javatutorialshub.market.service.CreateStockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class CreateStockController {
    private final CreateStockService createStockService;

    @PostMapping
    public void createStock(@RequestBody StockDTO stockDTO) throws CreateStockException {
        try {
            createStockService.create(stockDTO);
        } catch (CreateStockException e) {
            throw e;
        } catch (Exception e){
            log.warn("Technical error occurred when attempting to create stock due to: " + e.getMessage());
            throw new CreateStockException(e);
        }
    }
}
