package com.qa.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.qa.base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reusablemethods extends TestBase {
	static ExtentReports reports ;
    static  ExtentTest logger ;
	
	public static void CreateExtentReport() {
		String filename = new SimpleDateFormat("'NCL_'yyyyMMddHHmmSS'.html'").format (new Date());
		String path = "C:\\Practice\\"+ filename ;
		reports = new ExtentReports(path);
		}
	
}
