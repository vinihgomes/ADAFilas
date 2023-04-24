package main;

import java.util.ArrayList;
import java.util.List;

public abstract class EstruturaDeDados {
    protected List<Integer> dados;

    public EstruturaDeDados() {
        dados = new ArrayList<>();
    }

    public abstract void adicionar(int dado);

    public abstract int remover();

    public void mostrarDados() {
        if (dados.isEmpty()) {
            System.out.println("Não há dados.");
        } else {
            System.out.println("Dados: " + dados);
        }
    }
}