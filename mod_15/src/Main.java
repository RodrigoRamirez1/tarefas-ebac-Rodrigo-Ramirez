import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IFabricaCarros> listaFabricas = new ArrayList<>();
        listaFabricas.add(new FabricaCarroFusca());
        listaFabricas.add(new FabricaCarroByd());

        for (IFabricaCarros fabrica : listaFabricas) {
            System.out.println(fabrica.fabricar().getClass().getSimpleName());
        }
    }
}
