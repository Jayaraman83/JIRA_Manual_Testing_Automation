package fileOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook --> Sheet --> Rows --> Cells
//FileInputStream --> Reading from Excel
//FileOutputStream --> Writing into Excel

//XSSFWorkbook --> Workbook
//XSSFSheet --> Sheet
//XSSFRow --> Rows
//XSSFCell --> Cells

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/utility/TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Printing the total No. of rows in the sheet: " +totalRows);
		System.out.println("Printing the total No. of cells in the sheet: " +totalCells);
		
		//Now using the looping statement to print all the values from the Excel:
		
		for(int r = 0; r<=totalRows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c = 0; c<totalCells; c++) {
				
				XSSFCell cell = sheet.getRow(r).getCell(c);
				String cellValue = cell.toString();
				System.out.print(cellValue+" \t");
			}
			System.out.println();
			
		}
		
		wb.close();
		file.close();
	}

}
