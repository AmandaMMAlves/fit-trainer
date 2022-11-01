package com.mandy.study.fittrainer.models;

import lombok.Data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class IndiceTrainee {
    private String nome;
    private Double peso;
    private HashMap<String, Double> medidas;
    private String objetivo;

    //um recurso onde listasse em um certo periodo de tempo todos os movimentos já feitos pelo o Trainee

    public List<Movimento> getMovimentoPorRange(List<Movimento> movimentos, Timestamp rangeInit, Timestamp rangeFinal){
         return movimentos.stream().filter(movimento -> movimento.getTimestamp().after(rangeInit) &&
                movimento.getTimestamp().before(rangeFinal)).toList();
    }

    public int calculaCaloriaPorRange(List<Movimento> movimentos, Timestamp rangeInit, Timestamp rangeFinal){
        return getMovimentoPorRange(movimentos, rangeInit, rangeFinal)
                .stream().mapToInt(Movimento::getCalorias).sum();


    }



}
