package testscripts;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteExcel {
	 public static void main(String[] args) {
	        // Create a new workbook
	        try (Workbook workbook = new HSSFWorkbook()) {
	            // Create a sheet
	            org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Sheet1");

	            // Data to be written to the Excel sheet
	            Object[][] data = {
	                    {"Name", "Age", "City"},
	                    {"John Doe", 25, "New York"},
	                    {"Jane Smith", 30, "London"},
	                    {"Bob Johnson", 22, "Paris"}
	            };

	            // Write data to the sheet
	            int rowNum = 0;
	            for (Object[] rowData : data) {
	                Row row = sheet.createRow(rowNum++);
	                int colNum = 0;
	                for (Object field : rowData) {
	                    org.apache.poi.ss.usermodel.Cell cell = row.createCell(colNum++);
	                    if (field instanceof String) {
	                        cell.setCellValue((String) field);
	                    } else if (field instanceof Integer) {
	                        cell.setCellValue((Integer) field);
	                    }
	                    // Add more conditions for other data types if needed
	                }
	            }

	            // Save the workbook to a file
	            try (FileOutputStream outputStream = new FileOutputStream("output.xlsx")) {
	                workbook.write(outputStream);
	                workbook.close();
	            }

	            System.out.println("Excel file has been created successfully!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

