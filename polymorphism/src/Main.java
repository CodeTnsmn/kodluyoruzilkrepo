public class Main {
    public static void main(String[] args) {
        //BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DataBaseLogger()};
        //for(BaseLogger logger:loggers){
        //logger.log("log mesajı");

        CustomerManager customerManager = new CustomerManager(new FileLogger());
            customerManager.add();

    }
}