package com.trade.api.codeGenerator;

public class BooleanMapper extends Mapper{


    String nonIdNameWithOutDelimitter = "     @NotNull\n" +
        "    private Boolean NAME;\n" +
        "";

    String nonIdNameWithDelimitter = "    @NotNull\n" +
        "    @Column(name = \"originalName\")\n" +
        "    private Boolean formattedName; \n" +
        "";

    String getterGeneration = "    public Boolean getReplaceName() {\n" +
        "        return Replace;\n" +
        "    }\n";

    String setterGeneration =  "    public void setReplaceName(Boolean Replace) {\n" +
        "        this.Replace = Replace;\n" +
        "    }\n";

    @Override
    public String getNonIdNameWithOutDelimitter(){
        return this.nonIdNameWithOutDelimitter;
    }

    @Override
    public String getNonIdNameWithDelimitter(){
        return this.nonIdNameWithDelimitter;
    }

    @Override
    public String getGetterGeneration(){
        return this.getterGeneration;
    }

    @Override
    public String getSetterGeneration(){
        return this.setterGeneration;
    }

    @Override
    public String getColumnDefinition(){
        return this.nonIdNameWithDelimitter;
    }




}
