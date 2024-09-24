package fileOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel  File --> Workbook --> Sheet --> Rows --> Cells 
//FileInputStream --> Reading
//FileOutputStream --> Writing

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./utility/TestData.xlsx");
		
	//	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/utility/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		//XSSFSheet sheet = workbook.getSheetAt(1);
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total No of Rows: " +totalRows);
		System.out.println("Rotal No of Cells: " +totalCells);

		for(int r = 0; r<=totalRows; r++) {
		
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c = 0; c<totalCells; c++) {
				XSSFCell currentCell = currentRow.getCell(c);	
				String cellValue = currentCell.toString();
				System.out.print(cellValue+"\t");
			}
			System.out.println();
		}
	}
}