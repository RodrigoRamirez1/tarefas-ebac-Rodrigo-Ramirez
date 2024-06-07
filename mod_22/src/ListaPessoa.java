import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaPessoa {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);

        System.out.println("Digite o nome das pessoas e seu gênero: ");
        String listaString = p.nextLine();

        String[] separada = listaString.split(",");

        List<String> listaSeparada = Arrays.asList(separada);
        //listaSeparada.stream().forEach(l -> System.out.println(l));

        listaSeparada.stream()
                .filter(pessoa -> pessoa.split("-")[1].trim().equalsIgnoreCase("f"))
                .map(pessoa -> pessoa.split("-")[0])
                .forEach(mulher -> System.out.println(mulher));

    }

}
