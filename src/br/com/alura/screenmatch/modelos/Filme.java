public class Filme {
    // classe vai espificar o que o filme tem, coisas comuns
    // um protótipo do filme
    String nome;   //"os filmes cada um tem um nome"
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;    //private é um modificador de acesso, impede que altere o valor pelo main
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //metodo acessor. Por estar no privado ele visualiza o valores privados
    // ajuda no encapsulamento do código
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //MÉTODO
    // Como se fosse uma função dentro da clsse... " a maneira de fazer algo"
    // só fazer alguma coisa sem retorno chama o void
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }



}
