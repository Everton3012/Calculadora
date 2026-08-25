package br.com.Everton3012.calc.modelo;

import java.util.List;

public class Memoria {

    private enum TipoComando {
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
    }

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

        TipoComando tipoComando = detectarTipoComando(texto);

        if (texto.equalsIgnoreCase("AC")) {
            textoAtual = "";
        } else {
            textoAtual += texto;
        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private TipoComando detectarTipoComando(String texto) {
        if (textoAtual.isEmpty() && texto.equalsIgnoreCase("0")) {
            return null;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException e) {
            if (texto.equalsIgnoreCase("AC")) {
                return TipoComando.ZERAR;
            } else if (texto.equalsIgnoreCase("/")) {
                return TipoComando.DIV;
            } else if (texto.equalsIgnoreCase("*")) {
                return TipoComando.MULT;
            } else if (texto.equalsIgnoreCase("-")) {
                return TipoComando.SUB;
            } else if (texto.equalsIgnoreCase("+")) {
                return TipoComando.SOMA;
            } else if (texto.equalsIgnoreCase("=")) {
                return TipoComando.IGUAL;
            } else if (texto.equalsIgnoreCase(",")) {
                return TipoComando.VIRGULA;
            }
        }

        return null;
    }
}
