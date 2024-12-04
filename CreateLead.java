package testcase2;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	@Test(dataProvider="data")
	public  void createLead(String cName, String fName, String lName, String pNum ) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNum);
		driver.findElement(By.name("submitButton")).click();
	
}
	@DataProvider(name="data")
	public String[][] data() throws IOException {
		
		return ReadExcel.readData("CreateLead");
		
		
		/*
		 * String[][] str=new String[1][4];
		 * 
		 * str[0][0]="TestLeaf"; str[0][1]="Hari"; str[0][2]="R"; str[0][3]="99";
		 * 
		 * 
		 * return data();
		 */
	
	}
}






