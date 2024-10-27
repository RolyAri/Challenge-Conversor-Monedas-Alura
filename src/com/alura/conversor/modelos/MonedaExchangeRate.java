package com.alura.conversor.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record MonedaExchangeRate(@SerializedName("conversion_rates") Map<String, Double> conversionRates) {
}
