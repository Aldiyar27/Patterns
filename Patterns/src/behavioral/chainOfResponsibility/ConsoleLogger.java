package behavioral.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String messsage) {
        System.out.println("Standart Console->Logger: " + messsage);
    }
}
