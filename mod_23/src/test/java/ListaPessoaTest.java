import org.junit.Assert;
import org.junit.Test;
import teste.ListaPessoa;

import java.util.List;

public class ListaPessoaTest {
    @Test
    public void teste(){
        ListaPessoa lista = new ListaPessoa();
        List<String > mulheres = lista.filtraMulheres("Rodrigo-m,Pandora-f");
        Assert.assertEquals(mulheres, List.of("Pandora"));
    }
}
