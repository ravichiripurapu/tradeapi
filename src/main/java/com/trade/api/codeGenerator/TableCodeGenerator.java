package com.trade.api.codeGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TableCodeGenerator {

    int noOfRecords = 1;

    public static void main(String args[]) {
        TableCodeGenerator cg = new TableCodeGenerator();
        File file = cg.loadFile();
    }

    public File loadFile() {
        //Symbol
        //File file = new File("/Applications/TradingAPISpringBoot/src/main/java/com/trade/api/
        // codeGenerator/SymbolData");
        //Symbol_data_hourly
        //File file = new File("/Applications/TradingAPISpringBoot/src/main/java/com/" +
           // "trade/api/codeGenerator/SymbolHourlyData");
        //base url
        File file = new File("/Applications/TradingAPISpringBoot/src/main/java/com/" +
            "trade/api/codeGenerator/BaseUrlData");

        List<ColumnProperties> columnPropertyList = new ArrayList<>();
        try {
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String columnName = "";
                String dataType = "";
                if(noOfRecords>2){
                    StringTokenizer st = new StringTokenizer(line, "|");
                    while(st.hasMoreElements()){
                        columnName = st.nextToken().trim();
                        dataType = st.nextToken().trim();
                    }
                    ColumnProperties columnProperty = new ColumnProperties(columnName, dataType);
                    columnPropertyList.add(columnProperty);
                }
                 noOfRecords++;
            }
            columnPropertyList.stream().map(ColumnPropertyGeneration::getColumnNameBuilder).
                forEach(System.out::println);
            columnPropertyList.stream().map(ColumnPropertyGeneration::getSetterNameBuilder).
                forEach(System.out::println);
            columnPropertyList.stream().map(ColumnPropertyGeneration::getGetterNameBuilder).
                forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("test" + e);
            e.printStackTrace();
        }
        return file;
    }

}
