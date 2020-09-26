
package statics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;    
import org.apache.poi.ss.usermodel.Row;  

public class ExcelParser {
    
    private FileInputStream fis;
    private XSSFWorkbook wb;
    private XSSFSheet sheet;
    private Iterator<Row> itr;
    private Iterator<Cell> cellItr;
    private DataBaseManager dbm = new DataBaseManager();
    
    public void parseFile(File file) throws FileNotFoundException, IOException {
        this.fis = new FileInputStream(file);
        this.wb = new XSSFWorkbook(fis);
        this.sheet = wb.getSheetAt(0);
        this.itr = sheet.iterator();
        while(itr.hasNext()){
            Row row  = itr.next();
            cellItr = row.cellIterator();
            String[] dataHolder = {"","","","","",""};
            for(int i = 0; i < 6; i++){
                Cell cell = cellItr.next();
                switch(cell.getCellType()){
                    case Cell.CELL_TYPE_STRING:
                        dataHolder[i] = cell.getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        dataHolder[i] = Double.toString(cell.getNumericCellValue());

                
                }
            }
            Data data = new Data(dataHolder[0],dataHolder[1],dataHolder[2],dataHolder[3],dataHolder[4],dataHolder[5]);
            dbm.addData(data);
        }
    }
}

    

