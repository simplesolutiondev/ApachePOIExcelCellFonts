package simplesolution.dev;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FontTypeOffsetExample {

    public static void main(String... args) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("fonts-example");

        // Create Cell 1
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        Font font = workbook.createFont();
        font.setTypeOffset(Font.SS_SUPER);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        // Create Cell 1
        row = sheet.createRow(2);
        cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        font = workbook.createFont();
        font.setTypeOffset(Font.SS_SUB);

        cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        try (OutputStream fileOut = new FileOutputStream("apache-poi-fonts-type-offset.xls")) {
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
