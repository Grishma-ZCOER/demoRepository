import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfDemo {
	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("helloWrold.pdf"));
			document.open();
			document.add(new Paragraph("Hii Akshuuu."));
			document.add(new Paragraph("Please wake up dear!!!"));
			document.add(new Paragraph("Lets add some images"));
			//Image image1 = Image.getInstance("frnds.jpg");
			//document.add(image1);
			String imageUrl = "C:\\Users\\lntinfotech\\Desktop\\frnds.jpg";
			 Image image2 = Image.getInstance(new URL(imageUrl));
		    document.add(image2);
		   
		    document.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
