package behavioral.chainOfResponsibility;

public class FileLogger extends AbstractLogger{

    public FileLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String messsage) {
        System.out.println("File Console->Logger: " + messsage);
    }
}
