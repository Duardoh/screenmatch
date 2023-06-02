package br.com.alura.screenmatch.modelos;

public class Titulo {
    // classe vai espificar o que o filme tem, coisas comuns
    // um protótipo do filme
    private String nome;   //"os filmes cada um tem um nome"
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;    //private é um modificador de acesso, impede que altere o valor pelo main
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //metodo acessor. Por estar no privado ele visualiza o valores privados
    // ajuda no encapsulamento do código
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // setters é pra colocar um atributo
    // alt + insert atalho que possibilita a geração de um metodo ou botão direito e generate

    public void setNome(String nome) {
        this.nome = nome;       // o this seria para indicar este filme
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //MÉTODO
    // Como se fosse uma função dentro da clsse... " a maneira de fazer algo"
    // só fazer alguma coisa sem retorno chama o void
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
