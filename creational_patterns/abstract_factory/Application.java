public class Application {

    public static void main(String[] args)
    {
        System.out.println("Creating Product System using Concrete Factory 1");
        ProductSystem productSystem = new ProductSystem();
        ProductSystem productSystem1 = productSystem.CreateProductSystem(new ConcreteFactory1());
        System.out.println("Implementing methods product system 1");
        productSystem1.getProductA().productMethod1();
        productSystem1.getProductB().productMethod1();
        ProductSystem productSystem2 = productSystem.CreateProductSystem(new ConcreteFactory2());
        System.out.println("Implementing methods product system 2");
        productSystem2.getProductA().productMethod1();
        productSystem2.getProductB().productMethod1();
    }
    
}
