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

public class FontItalicStrikeoutExample {

    public static void main(String... args) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("fonts-example");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        Font font = workbook.createFont();
        font.setItalic(true);
        font.setStrikeout(true);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        try (OutputStream fileOut = new FileOutputStream("apache-poi-fonts-italic-strikeout.xls")) {
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
