package fileOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File --> Workbook --> Sheet --> Row --> Cell
//FileOutputStream --> Write Data into Excel Dynamically using Scanner Class using forloop

public class WriteDataIntoExcelDynamically {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"/utility/DynamicTestData.xlsx");
		
		//Now Create the Workbook:
		XSSFWorkbook wb = new XSSFWorkbook();
		
		//Now Create the Sheet:
		XSSFSheet sheet = wb.createSheet("DynamicData");
		
		//Using Scanner class to get input from the user during Run Time 
		Scanner sc = new Scanner(System.in);
		//Getting the number of rows and Columns from the user:
		System.out.println("Enter the total number of rows needed ?");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter the total number of cells needed ?");
		int noOfCells = sc.nextInt();
		
		//Now Iterating using for classic forloop:
		for(int r=0; r<=noOfRows; r++) {

			XSSFRow row = sheet.createRow(r);
			for(int c = 0; c<noOfCells; c++) {
				
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		//Now Associating the Workbook with the file:
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File has been Created with Dynamic Values provided by the User!!!");		
	}

}
