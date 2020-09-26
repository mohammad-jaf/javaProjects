
package statics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;    
import org.apache.poi.ss.usermodel.Row;  

public class ExcelExporter {
    
    FileOutputStream fos;
    XSSFWorkbook wb = new XSSFWorkbook();
    XSSFSheet sheet = wb.createSheet("data");
    DataBaseManager dbm = new DataBaseManager();
    
    public void exportFile(String filePath) throws FileNotFoundException, IOException{
        this.fos = new FileOutputStream(filePath);
        ArrayList<Data> data = this.dbm.getAllData("");
        int rowCount = 0 ;
        for(Data aData:data){   
            Row row = sheet.createRow(++rowCount);
            row.createCell(0).setCellValue(aData.getNamad());
            row.createCell(1).setCellValue(aData.getBazar());
            row.createCell(2).setCellValue(aData.getGhaimatMeyangin());
            row.createCell(3).setCellValue(aData.getPE());
            row.createCell(4).setCellValue(aData.getPEG());
            row.createCell(5).setCellValue(aData.getEPS());
            
        }
        wb.write(fos);
    }
    
    
    
}
