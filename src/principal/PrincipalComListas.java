package principal;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Batman", 2023);
        outroFilme.avalia(9);
        Filme filmeMatheus = new Filme("Homem Aranha 2", 2005);
        filmeMatheus.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();

        listaDeAssistidos.add(filmeMatheus);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item : listaDeAssistidos) {
            System.out.println(item.getNome() + " (" + item.getAnoDeLancamento() + ")");
            if (item instanceof Filme filme) {
                System.out.println(((Filme) item).getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Arnold");
        buscaPorArtista.add("Tom Holland");

        Collections.sort(buscaPorArtista); //ordena
        System.out.println(buscaPorArtista);
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaDeAssistidos);
    }
}

