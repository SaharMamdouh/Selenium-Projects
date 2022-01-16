package Utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils(".\\Excel\\data.xlsx","Sheet1");
		excel.getRowCount();
		excel.getCellNumber(1, 1);
		excel.getCellString(0, 0);

	}

}
