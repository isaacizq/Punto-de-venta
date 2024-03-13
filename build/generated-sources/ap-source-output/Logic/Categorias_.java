package Logic;

import Logic.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-12T15:17:22")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile SingularAttribute<Categorias, Integer> codigo;
    public static volatile ListAttribute<Categorias, Productos> productosList;
    public static volatile SingularAttribute<Categorias, String> nombre;

}