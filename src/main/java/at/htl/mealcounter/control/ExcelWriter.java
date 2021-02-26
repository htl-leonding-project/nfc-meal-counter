package at.htl.mealcounter.control;

import at.htl.mealcounter.entity.Person;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ApplicationScoped
public class ExcelWriter {


    @Inject
    PersonRepository personRepository;

    public void writeExcel() throws IOException {

        Person person = personRepository.findById(1);

        System.out.println(person.toString());

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Persons");
        sheet.setColumnWidth(0, 6000);
        sheet.setColumnWidth(1, 4000);

        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Abrechnungszeitraum: ");


        headerCell = header.createCell(1);
        Calendar cal = Calendar.getInstance();
        headerCell.setCellValue(new SimpleDateFormat("MMM").format(cal.getTime()) + " " + Calendar.getInstance().get(Calendar.YEAR));

//        Row row = sheet.createRow(1);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("Klasse: ");
//
//        row = sheet.createRow(1);
//        cell = row.createCell(1);
//        String classname = personRepository.findById(1).getClassName();
//        headerCell.setCellValue(classname);


        Row row = sheet.createRow(1);
        Cell cell = row.createCell(0);
        cell.setCellValue("Klasse: ");

        cell = row.createCell(1);
        String classname = personRepository.findById(1).getClassName();
        cell.setCellValue(classname);

        Row rowPreis = sheet.createRow(2);
        Cell cellPreis = rowPreis.createCell(0);
        cellPreis.setCellValue("Preis eines Menüs: ");

        cellPreis = rowPreis.createCell(1);
        cellPreis.setCellValue("5");

        Row rowAusgaben = sheet.createRow(3);

        Cell cellAusgaben;

        LocalDate startDate = LocalDate.of(2021, LocalDate.now().getMonth(), 1);
        System.out.println(startDate);
        LocalDate endDate = startDate.plusMonths(1);
        System.out.println(endDate);

        long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        List<LocalDate> datesUntil = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startDate.plusDays(i))
                .collect(Collectors.toList());

        for (int i = 0; i < datesUntil.size(); i++) {

            cellAusgaben = rowAusgaben.createCell(i+1);
            cellAusgaben.setCellValue(datesUntil.get(i).toString());
        }

        cellAusgaben = rowAusgaben.createCell(datesUntil.size()+1);
        cellAusgaben.setCellValue("Anzahl der Menüs");
        cellAusgaben = rowAusgaben.createCell(datesUntil.size()+2);
        cellAusgaben.setCellValue("Betrag");

        


        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "test.xlsx";

        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        workbook.close();
    }
}
