package g04.creational.singleton;

public class SingletonMultiThreadExample {

    public String value;
    private volatile static SingletonMultiThreadExample instance = null;
    private SingletonMultiThreadExample(String value) {

        try {
            Thread.sleep(10);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        this.value = value;

    }

    public static SingletonMultiThreadExample getInstance(String value){
        SingletonMultiThreadExample result = instance;
        if(result != null) {
            return result;
        }
        synchronized (SingletonMultiThreadExample.class){
            if(instance==null){
                instance = new SingletonMultiThreadExample(value);
            }
            return instance;
        }
    }
        public static void main(String args[]) {


        Thread first = new Thread(new First());
        Thread second = new Thread(new Second());
        first.start();
        second.start();

    }
    static class First implements Runnable {
        @Override
        public void run(){
            SingletonMultiThreadExample firstInst =  SingletonMultiThreadExample.getInstance("First");
            System.out.println(firstInst.value);
        }
    }
    static class Second implements Runnable {
        @Override
        public void run(){
            SingletonMultiThreadExample secondInst =  SingletonMultiThreadExample.getInstance("Second");
            System.out.println(secondInst.value);
        }
    }

}
