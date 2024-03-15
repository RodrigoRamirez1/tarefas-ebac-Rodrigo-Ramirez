import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        //Parte 1
        Scanner n = new Scanner(System.in);

        System.out.println("Liste alguns nomes, separando por vírgula: ");

        String listaN = n.next();
        String[] nomes = listaN.split(",");
        List<String> lista = new ArrayList<>();

        System.out.println("Lista dos nomes:");
        for (String nome : nomes) {
            lista.add(nome);
            System.out.println(nome);
        }

        Collections.sort(lista);
        System.out.println("Lista Ordenada: \n" + lista);



        //Parte 2
        Scanner nG = new Scanner(System.in);
        System.out.println("Liste o nome e gênero, separado por '-'. M para masculino e F para feminino: ");

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();


        String listaNG = nG.next();
        String[] pessoas = listaNG.split(",");

        for (String pessoa : pessoas) {
            String[] nomesGenero = pessoa.split("-");
            if(nomesGenero[1].equalsIgnoreCase("m")){
                masculino.add(nomesGenero[0]);
            } else {
                feminino.add(nomesGenero[0]);
            }
        }
        System.out.println("Grupo Masculino: " + masculino);
        System.out.println("Grupo Feminino: " + feminino);

    }
}
