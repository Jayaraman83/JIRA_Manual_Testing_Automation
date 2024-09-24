package fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook --> Sheet --> Row --> Cell
//FileOutputStream --> Write Data into Excel 

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/utility/InputTestData.xlsx");
		
		//Now Create the Workbook:
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//Now Create the Sheet:
		XSSFSheet sheet = wb.createSheet("Data");
		
		//Now create the Row inside Sheet:
		XSSFRow row1 = sheet.createRow(0);
		
				row1.createCell(0).setCellValue("Java Selenium WebDriver");
				row1.createCell(1).setCellValue(100);
				row1.createCell(2).setCellValue("Available");
				
		XSSFRow row2 = sheet.createRow(1);
		
				row2.createCell(0).setCellValue("Python with Pycharm");
				row2.createCell(1).setCellValue(200);
				row2.createCell(2).setCellValue("Available");
		
				
		XSSFRow row3 = sheet.createRow(2);
				
				row3.createCell(0).setCellValue("CSharp with Pycharm");
				row3.createCell(1).setCellValue(100);
				row3.createCell(2).setCellValue("In Available");
				
		//Now Associating the Workbook with the file:
		
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File has been Created !!!");		

				
	}

}
