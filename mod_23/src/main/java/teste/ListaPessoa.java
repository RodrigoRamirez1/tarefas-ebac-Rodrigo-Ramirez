package teste;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaPessoa {
    public List<String> filtraMulheres(String listaString) {

        String[] separada = listaString.split(",");

        List<String> listaSeparada = Arrays.asList(separada);
        //listaSeparada.stream().forEach(l -> System.out.println(l));

        return listaSeparada.stream()
                .filter(pessoa -> pessoa.split("-")[1].trim().equalsIgnoreCase("f"))
                .map(pessoa -> pessoa.split("-")[0])
                .collect(Collectors.toList());



    }

}
