import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NomeGenero {
    public static void main(String[] args) {
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
