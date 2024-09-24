package fileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String data;
	
	public static int getRowCount(String excelFile, String sheetName) throws IOException {
		
		file = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		int totalRows = sheet.getLastRowNum();
		wb.close();
		file.close();
		return totalRows;
	}
	
	public static int getCellCount(String excelFile, String sheetName, int rownum) throws IOException{
		file = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		int totalCells = sheet.getRow(rownum).getLastCellNum();
		wb.close();
		file.close();
		return totalCells;	
	}
	
	public static String getCellData(String excelFile, String sheetName, int rowNum, int cellNum) throws IOException {
		
		file = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellNum);

		String data;
		
		try {					//We are using try catch block in order to handle null data in excel 

			//data = cell.toString();
			DataFormatter formatData = new DataFormatter();
			data = formatData.formatCellValue(cell);
			
		} catch (Exception e) {
			data = "";
		}
		
		wb.close();
		file.close();
		return data;
		
	}
	
	public static void writeData(String excelFile, String sheetName, int rowRum, int cellNum, String data) throws IOException {

		file = new FileInputStream(excelFile);
		wb = new XSSFWorkbook(file);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowRum);

		cell = row.createCell(cellNum);
		cell.setCellValue(data);	
		FileOutputStream fo = new FileOutputStream(excelFile);
		wb.write(fo);
		fo.close();
		wb.close();
		file.close();
		
	}
}
