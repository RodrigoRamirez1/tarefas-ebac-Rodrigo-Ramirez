import java.util.ArrayList;
import java.util.List;

public class Concessonaria <T> {
    private List<T> veiculos = new ArrayList<>();

    public void addVeiculo(T veiculo){
        veiculos.add(veiculo);
    }

    public void imprimir(){
        for (T veiculo : veiculos) {
            System.out.println(veiculo.getClass().getSimpleName());
        }
    }
}
