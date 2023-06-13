public class ComplexStructure {
    private Product part1;
    private Product part2;

    public Product getPart1()
    {
        return part1;
    }

    public void setPart1(Product part1)
    {
        this.part1 = part1;
    }

    public Product getPart2()
    {
        return part2;
    }

    public void setPart2(Product part2)
    {
        this.part2 = part2;
    }

    public void showParts()
    {
        System.out.println("PART 1 : " + part1.getElement1());
        System.out.println("PART 2 : " + part2.getElement1());
    }
    
}
