package com.trade.api.codeGenerator;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ColumnPropertyGeneration {
    private String columnName;
    private String dataType;
    private DataTypeMapper mapper = new DataTypeMapper();
    private StringBuilder columnNameBuilder = new StringBuilder();
    private StringBuilder setterNameBuilder = new StringBuilder();
    private StringBuilder getterNameBuilder = new StringBuilder();

    public StringBuilder getColumnNameBuilder(){
        return columnNameBuilder;
    }

    public StringBuilder getSetterNameBuilder(){
        return setterNameBuilder;
    }

    public StringBuilder getGetterNameBuilder(){
        return getterNameBuilder;
    }



    public ColumnPropertyGeneration(String columnName, String dataType){
        this.columnName = columnName;
        this.dataType = dataType;
        init();
    }

    private void init() {
        Mapper dataTypeMapper = mapper.getMapper(dataType);
        String originalString = "";
        String formattedString = "";
        if(columnName.contains("_")){
           String[] column = columnName.split("_");
           formattedString = Arrays.stream(column).map(originalString1 ->
                getCamelCase(originalString1)).collect(Collectors.joining());
           originalString = getOriginalString(formattedString);
        }else{
            originalString = columnName;
            formattedString = getCamelCase(columnName);
        }
        if(columnName.contains("_")){
            columnNameBuilder.append(dataTypeMapper.replaceColumnDefinition(columnName, originalString));
        }else

            columnNameBuilder.append(dataTypeMapper.replaceCustomColumnDefinition(
                originalString));
        setterNameBuilder.append(dataTypeMapper.replaceSetterMethod(originalString, formattedString));
        getterNameBuilder.append(dataTypeMapper.replaceGetterMethod(originalString, formattedString));

    }

    private String getCamelCase(String originalString){
        String formattedString = originalString.substring(0,1).toUpperCase()
            .concat(originalString.substring(1, originalString.length()));
        return formattedString;
    }

    private String getOriginalString(String originalString){
        String formattedString = originalString.substring(0,1).toLowerCase()
            .concat(originalString.substring(1,originalString.length()));
        return formattedString;
    }

    @Override
    public String toString() {
        return "ColumnPropertyGeneration{" +
            "columnName='" + columnName + '\'' +
            ", dataType='" + dataType + '\'' +
            '}';
    }
}
