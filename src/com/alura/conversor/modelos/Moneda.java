package com.alura.conversor.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Moneda {
    private String nombre;
    private Map<String, Double> conversionValor;

    public Moneda(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Double> getConversionValor() throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().create();
        String direccion = "https://v6.exchangerate-api.com/v6/43c2f64edb4936b3c7ace11b/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        MonedaExchangeRate monedaExchangeRate = gson.fromJson(json, MonedaExchangeRate.class);
        this.conversionValor = monedaExchangeRate.conversionRates();
        return conversionValor;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "nombre='" + nombre + '\'' +
                ", conversionValor=" + conversionValor +
                '}';
    }
}
