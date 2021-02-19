package at.htl.mealcounter.control;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

class ExcelWriterTest {
    private ExcelWriter excelWriter;
    private static String FILE_NAME = "rosi.xlsx";
    private String fileLocation;

    @Test
    public void generateExcelFile() throws IOException {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        fileLocation = path.substring(0, path.length() - 1) + FILE_NAME;

        excelWriter = new ExcelWriter();
        excelWriter.writeExcel();
    }


}
