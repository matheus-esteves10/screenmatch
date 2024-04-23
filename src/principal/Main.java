package principal;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("O tempo de duração da séie completa é: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Batman", 2023);
        outroFilme.setDuracaoEmMinutos(160);
        meuFilme.avalia(7);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTitulo(meuFilme);
        calculadora.incluiTitulo(outroFilme);
        calculadora.incluiTitulo(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        Filme filmeMatheus = new Filme("Homem Aranha 2", 2005);
        filmeMatheus.setNome("Homem Aranha 2");
        filmeMatheus.setDuracaoEmMinutos(140);
        filmeMatheus.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();

        listaDeFilme.add(filmeMatheus);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("O tamanho da lista de filmes é " + listaDeFilme.size());
        System.out.println("O primeiro filme é " + listaDeFilme.get(0).getNome());
    }
}