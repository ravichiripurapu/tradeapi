package com.trade.api.codeGenerator;

public class BigIntMapper extends Mapper{

    String idName = "     @NotNull\n" +
        "    @Id\n" +
        "    @GeneratedValue(strategy = GenerationType.AUTO)\n" +
        "    private Long id;\n" +
        "";

    String nonIdNameWithOutDelimitter = "     @NotNull\n" +
        "    private Long NAME;\n" +
        "";

    String nonIdNameWithDelimitter = "    @NotNull\n" +
        "    @Column(name = \"originalName\")\n" +
        "    private Long formattedName; \n";

    String getterGeneration = "    public Long getReplaceName() {\n" +
        "        return Replace;\n" +
        "    }\n";

    String setterGeneration =  "    public void setReplaceName(Long Replace) {\n" +
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
