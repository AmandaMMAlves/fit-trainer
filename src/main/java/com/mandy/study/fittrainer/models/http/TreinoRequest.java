package com.mandy.study.fittrainer.models.http;

import lombok.Data;

import java.util.List;

@Data
public class TreinoRequest {

    private String idTrainnee;

    private List<String> exerciciosIds;
}
