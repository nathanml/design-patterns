/**
 * Client class
 */
public class ProductSystem implements AbstractProduct{
    private AbstractProduct productA;
    private ConcreteProductB productB;

    ProductSystem CreateProductSystem(ConcreteFactory1 factory)
    {
        ProductSystem productSystem = factory.createProductSystem();
        productSystem.setProductA(factory.createProductA());
        productSystem.setProductB(factory.createProductB());
        return productSystem;
    }

    ProductSystem CreateProductSystem(ConcreteFactory2 factory)
    {
        ProductSystem productSystem = factory.createProductSystem();
        productSystem.setProductA(factory.createProductA());
        productSystem.setProductB(factory.createProductB());
        return productSystem;
    }

    @Override
    public void productMethod1() {
        System.out.println("Method implemented for Product system");

    }

    public AbstractProduct getProductA()
    {
        return productA;
    }
    
    public void setProductA(ConcreteProductA productA)
    {
        this.productA = productA;
    }

    public AbstractProduct getProductB()
    {
        return productB;
    }
    
    public void setProductB(ConcreteProductB productB)
    {
        this.productB = productB;
    }
}
