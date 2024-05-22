import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflexaoApp {
    public static void main(String[] args) {

        System.out.println(ClasseComAnotacao.class.getAnnotation(ITabela.class).nome());

    }
}
