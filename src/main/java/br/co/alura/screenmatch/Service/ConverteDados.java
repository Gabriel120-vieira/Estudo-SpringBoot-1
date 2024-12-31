package br.co.alura.screenmatch.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IconvertDados{


    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterdados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json,classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
