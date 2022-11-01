package com.mandy.study.fittrainer.models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Movimento {

    private int calorias;

    private Timestamp timestamp;

    private Exercicio exercicio;
}
