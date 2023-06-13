public class Application {
    
    public static void main(String[] args)
    {
        System.out.println("Building new complex structure");
        //Director is created using concrete implementation of Builder
        Director director = new Director(new ConcreteBuilder());
        //Director constructs complex structure based on concrete builder implementation specified.
        ComplexStructure complexStructure = director.construct();
        complexStructure.showParts();
    }
}
