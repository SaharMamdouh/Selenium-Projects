package secondUtils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class secondExcelData {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
//		getRowCount();
//		getColCount();
//		getStringData(2,1);

	}
	
	public secondExcelData(String excelPath , String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static int getRowCount() {
		int rowCount=0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
			
		} catch (Exception e) {
			System.out.println("message is :"+ e.getMessage());
			System.out.println("cause is :"+e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int colCount=0;
		try {
			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colCount);
			
		} catch (Exception e) {
			System.out.println("message is :"+ e.getMessage());
			System.out.println("cause is :"+e.getCause());
			e.printStackTrace();
		}
		return colCount;
		
		
	}
	public static String getStringData(int rowNum , int colNum) {
		String cellData="";
		try {
			
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			
		} catch (Exception e) {
			System.out.println("message is :"+ e.getMessage());
			System.out.println("cause is :"+e.getCause());
			e.printStackTrace();
		}
		return cellData;
		
	}

}
