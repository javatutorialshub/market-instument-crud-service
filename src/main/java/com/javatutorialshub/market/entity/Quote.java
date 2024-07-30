package com.javatutorialshub.market.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tbl_quote")
@Data
@NoArgsConstructor
public class Quote extends AbstractEntity<Long> {
    @Id
    @Column(name = "quote_pk")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quotation_date")
    private LocalDateTime quotationDate;

    @Column(name = "quotation_price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "stock_fk")
    private Stock stock;
}
