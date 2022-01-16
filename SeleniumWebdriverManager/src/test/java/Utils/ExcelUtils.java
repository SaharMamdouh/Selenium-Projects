package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		
//		getRowCount();
//		getCellString(0,0);
//		getCellNumber(1,1);
	}
	
	public ExcelUtils(String excelpath , String sheetname) {
		try {
			//create reference for workbook xlsx file
			workbook = new XSSFWorkbook(excelpath);
			//create reference for sheet
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int getRowCount(){
		int rowCount=0;
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows is "+ rowCount );
		} catch (Exception e) {
			System.out.println("message is :"+ e.getMessage());
			System.out.println("cause is :"+ e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount(){
		int colCount=0;
		try {
			colCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("number of rows is "+ colCount );
		} catch (Exception e) {
			System.out.println("message is :"+ e.getMessage());
			System.out.println("cause is :"+ e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	public static String getCellString(int rownum , int colnum) {
		String CellData="";
		try {
			CellData=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(CellData);
		}
		catch(Exception e) {
			System.out.println("message is :"+e.getMessage());
			System.out.println("cause is :"+ e.getCause());
			e.printStackTrace();
		}
		return CellData;
	}
		
	public static void getCellNumber(int rownum , int colnum) {
		try {
			double CellNum = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(CellNum);
		}
		catch(Exception e) {
			System.out.println("message is :"+e.getMessage());
			System.out.println("cause is :"+ e.getCause());
			e.printStackTrace();
		}
	}	
		
	}


