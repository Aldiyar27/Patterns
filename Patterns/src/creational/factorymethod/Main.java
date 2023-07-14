package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone = SmartPhoneFactory.getInstance("IPhone", "IPhone 14 Pro Max");
        System.out.println(iPhone);

        SmartPhone samsung = SmartPhoneFactory.getInstance("IPhone", "Samsung S20");
        System.out.println(samsung);

        SmartPhone huawei = SmartPhoneFactory.getInstance("samsung", "Huawei P20");
        System.out.println(huawei);

        System.out.println(samsung.getClass() == huawei.getClass());

        System.out.println(samsung.getClass());
        System.out.println(huawei.getClass());
    }
}
