package fileOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File --> Workbook --> Sheet --> Row --> cell
// FileInputStream

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./utility/API_Sample_TestCase.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("StudentAPI_TestCase");
		
		int totalRowNum = sheet.getLastRowNum();
		
		int totalCellNum = sheet.getRow(1).getLastCellNum();
	
		System.out.println("Total No of Rows in the Sheet is: " +totalRowNum);
		System.out.println("Total No of Cells in the Sheet is: " +totalCellNum);
		
		//Now using a For classic loop to fetch the data in the excel:
		
		for(int r = 0 ; r<=totalRowNum ; r++) {
			
			XSSFRow row = sheet.getRow(r);
			
			for(int c = 0; c<totalCellNum; c++) {
				
				XSSFCell cell = row.getCell(c);
				String cellValue = cell.toString();
				System.out.print(cellValue+"\t");
			}
		
			System.out.println();
		}
		wb.close();
		file.close();
	}
}	
