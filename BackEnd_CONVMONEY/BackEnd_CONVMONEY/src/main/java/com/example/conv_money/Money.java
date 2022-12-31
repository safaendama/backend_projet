package com.example.conv_money;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Money {

    @JsonProperty("amount")
    private Double amount;

    @JsonProperty("from")
    private String from;

    @JsonProperty("to")
    private String to;

    public Money(Double amount,String from, String to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }
    public Double getAmount() {
        return amount;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }


}
