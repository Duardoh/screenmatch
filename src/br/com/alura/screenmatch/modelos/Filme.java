package br.com.alura.screenmatch.modelos;


import br.com.alura.screenmatch.calculo.Classificavel;

// o filme tem tudo que o titulo tem e ela vai heradr isso HERANÇA usando extends o filme é um titulo
// tudo que o titulo tem e mais o diretor
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
