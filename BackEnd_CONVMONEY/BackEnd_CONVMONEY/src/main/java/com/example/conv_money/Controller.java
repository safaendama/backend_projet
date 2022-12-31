package com.example.conv_money;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/conv/")
public class Controller {

    @GetMapping("student")
    public String hello(){
        return "Hello String";
    }

    @PostMapping("price")
    public Object conv(@RequestBody Money money){
        System.out.println(money.getAmount());
        System.out.println(money.getFrom());
        System.out.println(money.getTo());

        String host = "api.frankfurter.app";
        String url = "https://"+host+"/latest?amount="+money.getAmount()+"&from="+money.getFrom()+"&to="+money.getTo();
        System.out.println(url);
        RestTemplate restTemplate = new RestTemplate();
        Convertisseur result = restTemplate.getForObject(url, Convertisseur.class);
        return result.getRates();
    }
}
