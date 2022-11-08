package com.mandy.study.fittrainer.controllers;

import com.mandy.study.fittrainer.models.http.TreinoRequest;
import com.mandy.study.fittrainer.services.TreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/treino")
@RequiredArgsConstructor
public class TreinoController {

    private final TreinoService service;

    @PostMapping
    public ResponseEntity criaTreino(@RequestBody TreinoRequest request){
        return (ResponseEntity) ResponseEntity.ok();
    }
}
