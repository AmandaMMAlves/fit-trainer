package com.mandy.study.fittrainer.models;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class IndicacaoTreino {
    private String personalTrainer;

    private String trainee;

    private String objetivo;

    private List<Exercicio> exercicios;

    private LocalDate data;

}
