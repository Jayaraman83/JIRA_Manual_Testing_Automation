package fileOperations;

import java.io.IOException;

public class UsingExcelUtils {

	public static void main(String[] args) throws IOException {

		//Printing the Row count using the ExcelUtility class:
		//System.out.println(ExcelUtils.getRowCount("./utility/TestData.xlsx", "Sheet1"));
		//Printing the Cells count using the ExcelUtility class:
		//System.out.println(ExcelUtils.getCellCount("./utility/TestData.xlsx", "Sheet1",0));
		
		System.out.println(ExcelUtils.getCellData("./utility/TestData.xlsx", "Sheet1", 1, 20));
	}

}
