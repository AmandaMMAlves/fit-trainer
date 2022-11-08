package com.mandy.study.fittrainer.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class TreinoMontado {

    private Trainee trainee;

    private List<Exercicio> exerciciosRecomendados;

}
