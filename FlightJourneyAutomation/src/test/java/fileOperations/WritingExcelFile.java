package fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> WorkBook --> Sheet --> Row --> Cell
//FileOutputStream

public class WritingExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("./utility/WriteNewExcel.xlsx");
				
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("FirstData");
		
		XSSFRow row1 = sheet.createRow(0);
			row1.createCell(0).setCellValue("TestData1");
			row1.createCell(1).setCellValue("TestData2");
			row1.createCell(2).setCellValue("TestData3");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("TestData11");
			row2.createCell(1).setCellValue("TestData22");
			row2.createCell(2).setCellValue("TestData33");
			
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File Created Successfully!!!");
		
	}
	
}
