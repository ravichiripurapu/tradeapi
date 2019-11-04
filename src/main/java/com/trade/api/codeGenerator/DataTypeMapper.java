package com.trade.api.codeGenerator;

import java.util.HashMap;
import java.util.Map;

public class DataTypeMapper {
    static Map<String, Mapper> dataTypeMap = new HashMap<>();
    static{
        dataTypeMap.put("bigint", new BigIntMapper());
        dataTypeMap.put("character varying", new CharacterVaryingMapper());
        dataTypeMap.put("date", new DateMapper());
        dataTypeMap.put("numeric", new NumericMapper());
        dataTypeMap.put("integer", new IntegerMapper());
    }

    public Mapper getMapper(String dataType){
        return dataTypeMap.get(dataType);
    }


}
