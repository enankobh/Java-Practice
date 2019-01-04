package pdfcreation;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class HeaderFooterUtils extends PdfPageEventHelper {
	
	
	

    public void onStartPage(PdfWriter writer, Document document) {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd / MM / yyyy");
    	Date today = new Date();
    	String result = formatter.format(today);
    	
    	
    	Font font1 = new Font();
    	font1.setSize(7.0f);
    	font1.setColor(BaseColor.LIGHT_GRAY);
    	font1.setStyle(Font.ITALIC);
    	
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Correspondence Document",font1), 70, 830, 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(result,font1), 550, 830, 0);
       
        /*PdfContentByte cb = writer.getDirectContent();
        cb.setLineWidth(0.5f); 
        cb.moveTo(0, 790);
        cb.lineTo(800, 790);
        cb.stroke();*/
    }

    public void onEndPage(PdfWriter writer, Document document) {
    	Font font1 = new Font();
    	font1.setSize(7.0f);
    	font1.setColor(BaseColor.BLUE);
    	font1.setStyle(Font.ITALIC);
    	
    	Font font2 = new Font();
    	font2.setSize(8.0f);
    	font2.setColor(BaseColor.LIGHT_GRAY);
    	
    	Anchor anchor = new Anchor("Powered by DXP", font1);
        
    	/*PdfContentByte cb = writer.getDirectContent();
        cb.setLineWidth(0.5f); 
        cb.moveTo(0, 45);
        cb.lineTo(800, 45);
        cb.stroke();*/
        
    	ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, anchor, 50, 5, 0);
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Page " + document.getPageNumber(),font2), 550, 5, 0);
    }

}