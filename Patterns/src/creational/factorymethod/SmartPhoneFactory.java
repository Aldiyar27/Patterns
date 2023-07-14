package creational.factorymethod;

public class SmartPhoneFactory {
    public static SmartPhone getInstance(String name, String modelName){
        if (name == "IPhone") {
            return new IPhone(modelName);
        } else if(name == "samsung"){
            return new Samsung(modelName);
        } else if(name == "huawei"){
            return new Huawei(modelName);
        }
        return null;
    }
}
