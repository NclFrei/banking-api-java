package com.fiap.FinApi.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.FinApi.Models.Conta;

@RestController
@RequestMapping("Conta")
public class ContaController {

    private List<Conta> repository = new ArrayList<>();

    @GetMapping("/conta")
    public List<Conta> index() {
        return repository;
    }

}
