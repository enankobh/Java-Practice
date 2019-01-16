package tryblock;

public class AutoClose implements AutoCloseable {    
    
    @Override
    public void close() {
        System.out.println(">>> close()");
        throw new RuntimeException("Exception in close()");
    }
    
    public void work() throws MyException {
        System.out.println(">>> work()");
        throw new MyException("Exception in work()");
    }
    
    public static void main(String[] args) {
        try (AutoClose autoClose = new AutoClose()) {
            autoClose.work();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
class MyException extends Exception {
    
    public MyException() {
        super();
    }
    
    public MyException(String message) {
        super(message);
    }
}