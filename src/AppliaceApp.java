public class AppliaceApp {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        PowerOutlet laptop1 = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigerator1 = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneCharger1 = new SmartphoneAdapter(smartphoneCharger);

        System.out.println();
        System.out.println(laptop1.plugIn());
        System.out.println(refrigerator1.plugIn());
        System.out.println(smartphoneCharger1.plugIn());
    }
}