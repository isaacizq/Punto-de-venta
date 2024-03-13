package Logic;

import Logic.Clientes;
import Logic.ProductoVenta;
import Logic.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-12T15:17:22")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile ListAttribute<Factura, ProductoVenta> productoVentaList;
    public static volatile SingularAttribute<Factura, Usuario> usuarioIdusuario;
    public static volatile SingularAttribute<Factura, Clientes> clientesCedula;
    public static volatile SingularAttribute<Factura, Long> idfactura;

}