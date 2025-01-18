package br.com.alura.screenmatch2.Service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
