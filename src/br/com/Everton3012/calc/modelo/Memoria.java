package br.com.Everton3012.calc.modelo;

import java.util.List;

public class Memoria {

    private static Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new java.util.ArrayList<>();

    private String textoAtual = "";

    private Memoria() {
    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String texto) {
        if (texto.equalsIgnoreCase("AC")) {
            textoAtual = "";
        } else {
            textoAtual += texto;
        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }
}
