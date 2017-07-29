package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("E:\\ExcelRead.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		//System.out.println(rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			Row r= ws.getRow(i);
			int colCount = r.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				Cell c = r.getCell(j);
				System.out.println(c.getStringCellValue()+" ");
			}
			System.out.println();
			
		}
	}

}
