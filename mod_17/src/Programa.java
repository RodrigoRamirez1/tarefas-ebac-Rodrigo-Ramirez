import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        Concessonaria <Carro> concessonaria = new Concessonaria<>();
        concessonaria.addVeiculo(new Suv());
        concessonaria.addVeiculo(new Esportivo());
        concessonaria.addVeiculo(new Picape());

        concessonaria.imprimir();
    }
}
