package ru.job4j.job4j_kafka_connect.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Order {
    private Integer id;
    private Integer dishTd;
}
