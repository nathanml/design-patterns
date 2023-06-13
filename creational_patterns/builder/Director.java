public class Director{
    Builder builder;

    public Director(Builder b)
    {
        this.builder = b;
    }

    public ComplexStructure construct()
    {
        ComplexStructure ret = new ComplexStructure();
        builder.buildPart1();
        builder.buildPart2();
        ret.setPart1(builder.getPart1());
        ret.setPart2(builder.getPart2());
        return ret;
    }
}