
package Logic;
import Controller.FacturaJpaController;
import Controller.ProductosJpaController;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode39;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author isaacXP58IIH'BU2009210233
 * 
 */
public class Barra {

    public static void main(String[] args) {
        try {
            Document doc = new Document();
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("Codigos.pdf"));
            doc.open();
            Barcode39 code = new Barcode39();
            FacturaJpaController cp = new FacturaJpaController();
            for (int i = 0; i < cp.findFacturaEntities().size(); i++) {
                String n = String.valueOf(cp.findFacturaEntities().get(i).getIdfactura());
                code.setCode(n);
                Image img = code.createImageWithBarcode(pdf.getDirectContent(), BaseColor.BLACK, BaseColor.BLACK);
                doc.add(img);
                doc.add(new Paragraph(" "));
                
            }
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Barra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Barra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
