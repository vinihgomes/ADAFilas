package main;

public class Pilha extends EstruturaDeDados {
    public void adicionar(int dado) {
        dados.add(dado);
    }

    public int remover() {
        if (!dados.isEmpty()) {
            int indiceUltimo = dados.size() - 1;
            int dadoRemovido = dados.get(indiceUltimo);
            dados.remove(indiceUltimo);
            return dadoRemovido;
        } else {
            return -1;
        }
    }
}

