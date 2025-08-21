package readexcelsheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadSheetData {
    public static void main(String[] args) {
        String sheetPath = "C:\\Users\\admin\\IdeaProjects\\GitProjectFirst\\TestData\\TestDataSheet.xlsx";
        File f = new File(sheetPath);
        try {
            FileInputStream fis = new FileInputStream(f);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet mySheet = wb.getSheet("LoginData");

            int totalRows = mySheet.getPhysicalNumberOfRows();
            int totalColumns = mySheet.getRow(0).getLastCellNum();
            System.out.println("Total number of rows: "+totalRows);
            System.out.println("Total number of columns: "+totalColumns);

            //This code will return only single email and password...
//            String email = mySheet.getRow(1).getCell(0).getStringCellValue();
//            String password = mySheet.getRow(1).getCell(1).getStringCellValue();
//            System.out.println("Email is: "+email);
//            System.out.println("Password is: "+password);

            //This code will give you all email and password from the sheet...
            for(int i=1; i<totalRows; i++){
                for(int j=0; j<totalColumns;j++){
                    System.out.println(mySheet.getRow(i).getCell(j).getStringCellValue());
                }
            }
            wb.close();
            fis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
