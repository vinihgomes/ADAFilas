package main;

public class Fila extends EstruturaDeDados {
    public void adicionar(int dado) {
        dados.add(dado);
    }

    public int remover() {
        if (!dados.isEmpty()) {
            int dadoRemovido = dados.get(0);
            dados.remove(0);
            return dadoRemovido;
        } else {
            return -1;
        }
    }
}
