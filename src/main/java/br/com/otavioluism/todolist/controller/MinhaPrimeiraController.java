package br.com.otavioluism.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // classe para trabalhar com rest full requisicao e resposta
@RequestMapping("/primeira-rota") // classe para criar o nome da rota 
public class MinhaPrimeiraController {
  
  @GetMapping("/") // classe para passar o path da rota metodos HTTP Get
  public String primeiraMensagem() {
    return "Funciounou";
  }

}
