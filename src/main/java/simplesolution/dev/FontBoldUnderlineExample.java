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

public class FontBoldUnderlineExample {

    public static void main(String... args) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("fonts-example");

        // Create Cell 1
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        Font font = workbook.createFont();
        font.setBold(true);
        font.setUnderline(Font.U_SINGLE);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        // Create Cell 1
        row = sheet.createRow(2);
        cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        font = workbook.createFont();
        font.setBold(true);
        font.setUnderline(Font.U_DOUBLE);

        cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        // Create Cell 3
        row = sheet.createRow(4);
        cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        font = workbook.createFont();
        font.setBold(true);
        font.setUnderline(Font.U_SINGLE_ACCOUNTING);

        cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        // Create Cell 4
        row = sheet.createRow(6);
        cell = row.createCell(0);
        cell.setCellValue("SimpleSolution.dev");

        font = workbook.createFont();
        font.setBold(true);
        font.setUnderline(Font.U_DOUBLE_ACCOUNTING);

        cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        try (OutputStream fileOut = new FileOutputStream("apache-poi-fonts-bold-underline.xls")) {
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
