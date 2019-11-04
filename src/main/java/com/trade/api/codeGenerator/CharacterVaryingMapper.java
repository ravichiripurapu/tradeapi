package com.trade.api.codeGenerator;

public class CharacterVaryingMapper extends Mapper{


    String nonIdNameWithOutDelimitter = "     @NotNull\n" +
        "    private String NAME;\n" +
        "";

    String nonIdNameWithDelimitter = "    @NotNull\n" +
        "    @Column(name = \"originalName\")\n" +
        "    private String formattedName; \n";

    String getterGeneration = "    public String getReplaceName() {\n" +
        "        return Replace;\n" +
        "    }\n";

    String setterGeneration =  "    public void setReplaceName(String Replace) {\n" +
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
