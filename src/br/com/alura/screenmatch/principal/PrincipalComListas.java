package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){ // para cada item em Titulo sera iplementado em lista
            System.out.println(item);
            if(item instanceof Filme){
                var filme = (Filme) item; // transforma o item no objeto referenciado para poder iterar
                System.out.println(filme.getClassificacao());
            }

        }
    List<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adam Sandler");
    buscaPorArtista.add("Morgan Freeman");
    buscaPorArtista.add("Leonardo Dicaprio");

    Collections.sort(buscaPorArtista);
    System.out.println(buscaPorArtista);
    Collections.sort(lista);
    System.out.println(lista);
    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));





    }
}
