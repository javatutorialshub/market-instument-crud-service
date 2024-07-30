package com.javatutorialshub.market.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tbl_stock")
@Data
@NoArgsConstructor
public class Stock extends AbstractEntity<Long> {
    @Id
    @Column(name = "stock_pk")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "isin")
    private String isin;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL)
    private List<Quote> quotes;
}
