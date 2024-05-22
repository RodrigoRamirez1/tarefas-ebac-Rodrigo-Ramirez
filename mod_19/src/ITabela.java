import java.lang.annotation.*;

/**
 * @author rodrigo.ramirez
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ITabela {
    String nome();
}
