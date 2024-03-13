package Logic;

import Logic.Factura;
import Logic.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-12T15:17:22")
@StaticMetamodel(ProductoVenta.class)
public class ProductoVenta_ { 

    public static volatile SingularAttribute<ProductoVenta, Factura> facturaIdfactura;
    public static volatile SingularAttribute<ProductoVenta, Productos> productosCodigo;
    public static volatile SingularAttribute<ProductoVenta, Integer> cantidad;
    public static volatile SingularAttribute<ProductoVenta, Integer> idproductoVenta;

}