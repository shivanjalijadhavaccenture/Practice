package Utility_Acti;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilTest {
	public static String testData(int rowIndex,int cellIndex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
		 Sheet sh = WorkbookFactory.create(fis).getSheet("Acti");
		 String data = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		 return data;
	}

}
