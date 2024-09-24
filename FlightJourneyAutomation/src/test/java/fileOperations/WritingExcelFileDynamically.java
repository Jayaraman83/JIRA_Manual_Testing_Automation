package fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> WorkBook --> Sheet --> Row --> Cell
//FileOutputStream

public class WritingExcelFileDynamically {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("./utility/WriteNewExcelDynamically.xlsx");
				
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("FirstDataDynamically");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No of Rows: ");
		int noOfRows = sc.nextInt();
			
		System.out.println("Enter the No of Cells: ");
		int noOfCells = sc.nextInt();

		for(int r = 0; r<=noOfRows; r++) {
			
			XSSFRow row = sheet.createRow(r);
			
			for(int c = 0; c<noOfCells; c++) {
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File Created Successfully!!!");
	}
}
