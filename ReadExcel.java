package testcase2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileNAme) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Daydreamer\\eclipse-workspace\\HM\\data\\"+fileNAme+".xlsx");

		int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(lastRowNum);
		short lastCellNum = wb.getSheet("Sheet1").getRow(1).getLastCellNum();

		String[][] data = new String[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {

			for (int j = 0; j < lastCellNum; j++) {

				String stringCellValue = wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i - 1][j] = stringCellValue;
			}

		}

		wb.close();
		return data;
	}

}
