package creational.factorymethod;

public class IPhone extends SmartPhone {
    private String modelName;

    public IPhone(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
