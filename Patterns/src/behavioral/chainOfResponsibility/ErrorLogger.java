package behavioral.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String messsage) {
        System.out.println("Error Console->Logger: " + messsage);
    }
}
