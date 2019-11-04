package com.trade.api.codeGenerator;

public class Mapper {
    protected String nonIdNameWithOutDelimitter = "     @NotNull\n" +
        "    private Date NAME;\n" +
        "";

    protected String nonIdNameWithDelimitter = "    @NotNull\n" +
        "    @Column(name = \"originalName\")\n" +
        "    private Date formattedName; \n";

    protected String getterGeneration = "    public Date getReplaceName() {\n" +
        "        return Replace;\n" +
        "    }\n";

    protected String setterGeneration =  "    public void setReplaceName(Date Replace) {\n" +
        "        this.Replace = Replace;\n" +
        "    }\n";




    public String getNonIdNameWithOutDelimitter(){
        return this.nonIdNameWithOutDelimitter;
    }

    public String getNonIdNameWithDelimitter(){
        return this.nonIdNameWithDelimitter;
    }

    public String getGetterGeneration(){
        return this.getterGeneration;
    }

    public String getSetterGeneration(){
        return this.setterGeneration;
    }

    public String getColumnDefinition(){
        return this.nonIdNameWithDelimitter;
    }

    public String replaceColumnDefinition(String originalString, String formattedString){
        String returnString = getNonIdNameWithDelimitter().replace("originalName", originalString);
        returnString = returnString.replace("formattedName", formattedString);
        return returnString;
    }

    public String replaceCustomColumnDefinition(String nonFormattedOriginalString){
        String returnString = getNonIdNameWithOutDelimitter().replace("NAME", nonFormattedOriginalString);
        return returnString;
    }

    public String replaceSetterMethod(String originalString, String formattedString){
        String returnString = getSetterGeneration().replace("ReplaceName", formattedString);
        returnString = returnString.replace("Replace", originalString);
        return returnString;
    }

    public String replaceGetterMethod(String originalString, String formattedString){
        String returnString = getGetterGeneration().replace("ReplaceName", formattedString);
        returnString = returnString.replace("Replace", originalString);
        return returnString;
    }

}
