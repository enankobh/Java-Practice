package pdfcreation;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Set;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class PDFCreator {

	public static String createPDF(List<JSONObject> list) {
		return null;
	}
	public static void main(String[] args) {
		String path = "C:\\Users\\EN334457\\git\\Java-Practice\\"; //ConsultingKitServlet.getApplcatonPath();
		  System.out.println(path);
		  String jsonData="[ { LTR_IMB: '1234567890'," + 
		  		"LTR_customer_preference: ''," + 
		  		"LTR_DIC_code: 'CAPOne card Serices'," + 
		  		"LTR_DRILND: 'xxxx'," + 
		  		"IFM_FLI_OVR: 'YYYYYY'," + 
		  		"LTR_METADATAID: 'a0001'," + 
		  		"LTR_PRINT_ID: 'p0001'," + 
		  		"LTR_FINAL_PRINT_ID: 'TR000001'," + 
		  		"LTR_TEMP_NUM: 'Temp001' }," + 
		  		"{ LTR_IMB: '1999999999'," + 
		  		"LTR_customer_preference: 'Peference two'," + 
		  		"LTR_DIC_code: 'CAPOne card Serices'," + 
		  		"LTR_DRILND: 'GGGG'," + 
		  		"IFM_FLI_OVR: 'HHHHH'," + 
		  		"LTR_METADATAID: 'A0002'," + 
		  		"LTR_PRINT_ID: 'p0002'," + 
		  		"LTR_FINAL_PRINT_ID: 'TR000002'," + 
		  		"LTR_TEMP_NUM: 'Temp002' }," + 
		  		"{ LTR_IMB: '2345678981'," + 
		  		"LTR_customer_preference: 'Pefernce three'," + 
		  		"LTR_DIC_code: 'CAPOne card Serices'," + 
		  		"LTR_DRILND: 'UUUU'," + 
		  		"IFM_FLI_OVR: 'KKKKK'," + 
		  		"LTR_METADATAID: 'A00003'," + 
		  		"LTR_PRINT_ID: 'p0003'," + 
		  		"LTR_FINAL_PRINT_ID: 'TR000003'," + 
		  		"LTR_TEMP_NUM: 'Temp003' } ]";
		  JSONArray jarray = JSONArray.fromObject(jsonData);
		  new PDFCreator().readGeneratePDF(jarray,path,"BE468494584C433D0A6C80854C0FDBFD");
			 
	}
	 private PdfPTable createFirstTable(String path, JSONObject jsonObject) {
		 PdfPTable table = new PdfPTable(new float[] { 4, 6 });
		 PdfPCell cell = table.getDefaultCell();
		 try {
			Font font1 = new Font();
		    font1.setSize(10.0f);
		    table.setSpacingBefore(20f);
		    table.setSpacingAfter(20f);
		    table.setWidthPercentage(90f);	
	        table.setHorizontalAlignment(1);
	        cell.setBorder(Rectangle.NO_BORDER);
	        cell.setUseBorderPadding(true);
	        cell.setPadding(5);
	        cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
	        cell.setHorizontalAlignment(Rectangle.LEFT);
				Set<String> keys = jsonObject.keySet();
				for(String key : keys) {
					
					table.addCell(new Phrase(key.toString().replaceAll("_", " "),font1));
					table.addCell(new Phrase(jsonObject.getString(key).equals("") ? "-" : jsonObject.getString(key),font1));
					table.completeRow();
				}
				
	     }catch(Exception e) {
			 e.printStackTrace();
		 }
	        return table;
	 }
	 public void readGeneratePDF(JSONArray jarray, String path, String sessionID) {
		    Document document = new Document();
		    // LEFT, RIGHT, TOP, BOTTOM
		    document.setMargins(15, 15, 70, 80);
		    try {
		    	PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream(path+"/output/"+sessionID+".pdf"));
		        document.open();
		        HeaderFooterUtils event = new HeaderFooterUtils();
		        writer.setPageEvent(event);
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        document.add( Chunk.NEWLINE );
		        
		        Font font1 = new Font();
		    	font1.setSize(30.0f);
		    	font1.setColor(BaseColor.BLACK);
		        Paragraph pp = new Paragraph("Correspondence Documents",font1);
		        pp.setAlignment(Paragraph.ALIGN_CENTER);
		        document.add(pp );
		        document.setMargins(120, 120, 70, 80);
		        document.newPage();
		        
		        for(int j=0; j<jarray.size();j++){
					JSONObject js1 = (JSONObject)jarray.get(j);
					document.add(createFirstTable(path, js1));
					if(j <jarray.size() - 1)
						document.newPage();
				}
		        
		    } catch(Exception e){
		      e.printStackTrace();
		    }
		    finally {
		    	document.close();
		    }
		  }
}
