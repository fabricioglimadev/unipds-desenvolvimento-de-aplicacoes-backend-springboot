package br.dev.fabricioglima.helloword.controller;

import br.dev.fabricioglima.helloword.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello(){
    return "Hello World";
  }

  @GetMapping("/produtos")
  public Produto getPoduto(){
    Produto p = new Produto();
    p.setId(12345);
    p.setNome("Computador");
    p.setPreco(1500);
    return p;
  }

  @PostMapping("produtos")
  public String addNewProduct(@RequestBody Produto p){
    System.out.println("Produto recebido");
    System.out.println(p.getId() +"/"+p.getNome()+"/"+p.getPreco());
    return "ok";
  }

}
