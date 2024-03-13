package Logic;

import Logic.Categorias;
import Logic.ProductoVenta;
import Logic.Proveedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-12T15:17:22")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Date> fechaCaducidad;
    public static volatile SingularAttribute<Productos, Date> fechaIngreso;
    public static volatile ListAttribute<Productos, ProductoVenta> productoVentaList;
    public static volatile SingularAttribute<Productos, Integer> codigo;
    public static volatile SingularAttribute<Productos, Integer> cantidadIngreso;
    public static volatile SingularAttribute<Productos, Integer> precioUnitario;
    public static volatile SingularAttribute<Productos, Proveedores> proveedoresCodigo;
    public static volatile SingularAttribute<Productos, Integer> unidadMedida;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, Categorias> categoriasCodigo;
    public static volatile SingularAttribute<Productos, Integer> cantidadDisponible;

}