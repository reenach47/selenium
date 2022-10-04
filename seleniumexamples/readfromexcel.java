package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromexcel {

	public static void main(String[] args) throws IOException {

		//Prepare the path of excel file
		String filePath="c:";
		String fileName="example1.xls";
		String sheetName="Sheet1";

	    File file = new File(filePath+"\\"+fileName);

	    FileInputStream inputStream = new FileInputStream(file);

	  
	      
	    	XSSFWorkbook WorkBook = new XSSFWorkbook(inputStream);

	    }

	   	   Sheet sheet = XSSFWorkbook.getSheet(sheetName);

	   

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    String username,password;
	    Sheet row=sheet;



		Row getrow(1);

	    

	    for (int i = 0; i < rowCount+1; i++) {

	