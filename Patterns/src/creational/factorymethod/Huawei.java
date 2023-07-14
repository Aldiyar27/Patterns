package creational.factorymethod;

public class Huawei extends SmartPhone{
    private String modelName;

    public Huawei(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }
}
