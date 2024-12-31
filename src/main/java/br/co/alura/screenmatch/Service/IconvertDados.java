package br.co.alura.screenmatch.Service;

public interface IconvertDados {
    <T> T obterdados(String json, Class<T> classe);
}
