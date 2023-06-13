public class ConcreteBuilder implements Builder{
    Product part1;
    Product part2;

    @Override
    public Product getPart1() {
        System.out.println("Building part 1");
        Product ret = new Product();
        ret.setElement1("1");
        return ret;
    }

    @Override
    public Product getPart2() {
        System.out.println("Building part 2");
        Product ret = new Product();
        ret.setElement1("2");
        return ret;
    }

    @Override
    public void buildPart1() {
        Product part1 = new Product();
        part1.setElement1("1");
        this.part1 = part1;
    }

    @Override
    public void buildPart2() {
        Product part2 = new Product();
        part2.setElement1("2");
        this.part2 = part2;
    }
    
}
