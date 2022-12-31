package com.example.conv_money;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Convertisseur {

    @JsonProperty("amount")
    private long amount;

    @JsonProperty("base")
    private String base;

    @JsonProperty("rates")
    private Object rates;


    public Convertisseur() {

    }

    public long getAmount() {
        return amount;
    }

    public String getBase() {
        return base;
    }

    public Object getRates(){
        return rates;
    }
}
