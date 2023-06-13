public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public ConcreteProductA createProductA() {
        System.out.println("Creating Product A based on Factory 1 implementation");
        return new ConcreteProductA();
    }

    @Override
    public ConcreteProductB createProductB() {
        System.out.println("Creating Product B based on Factory 1 implementation");
        return new ConcreteProductB();
    }

    @Override
    public ProductSystem createProductSystem() {
        System.out.println("Creating Product B based on Factory 1 implementation");
        return new ProductSystem();
    }
    
}
