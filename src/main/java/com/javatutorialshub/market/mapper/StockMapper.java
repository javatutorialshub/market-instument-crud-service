package com.javatutorialshub.market.mapper;

import com.javatutorialshub.market.dto.QuoteDTO;
import com.javatutorialshub.market.dto.StockDTO;
import com.javatutorialshub.market.entity.Quote;
import com.javatutorialshub.market.entity.Stock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collection;
import java.util.List;

@Mapper
public interface StockMapper {
    StockMapper MAPPER = Mappers.getMapper(StockMapper.class);

    @Mapping(target = "id", source = "stockId")
    @Mapping(target = "name", source = "stockName")
    Stock toStock(StockDTO stockDTO);

    @Mapping(target = "id", source = "quoteId")
    @Mapping(target = "quotationDate", source = "quoteDate")
    @Mapping(target = "price", source = "quotePrice")
    Quote toQuote(QuoteDTO quoteDTO);

    List<Quote> toQuotes(List<QuoteDTO> quoteDTOs);


    Collection<StockDTO> toStockDTOs(Collection<Stock> stocks);

    @Mapping(target = "stockId", source = "id")
    @Mapping(target = "stockName", source = "name")
    StockDTO toStockDTO(Stock stock);

    @Mapping(target = "quoteId", source = "id")
    @Mapping(target = "quoteDate", source = "quotationDate")
    @Mapping(target = "quotePrice", source = "price")
    QuoteDTO toQuoteDTO(Quote quote);

    List<QuoteDTO> toQuoteDTOs(List<Quote> quotes);
}
