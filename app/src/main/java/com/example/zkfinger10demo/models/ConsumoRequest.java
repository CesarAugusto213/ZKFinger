package com.example.zkfinger10demo.models;

public class ConsumoRequest {

    private String pin;
    private String feature;

    public ConsumoRequest(String pin, String feature) {
        this.pin = pin;
        this.feature = feature;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

}
