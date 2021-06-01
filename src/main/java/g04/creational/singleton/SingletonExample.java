package g04.creational.singleton;

public class SingletonExample {

    private static SingletonExample single_instance =null;
    public String print_statement;
    private SingletonExample(){
        print_statement = "Example on Creational->Singleton pattern";
    }

    public static SingletonExample getInstance(){
        if(single_instance == null)
            single_instance = new SingletonExample();
        return single_instance;
    }

    public static void main(String args[]) {
        SingletonExample se =  SingletonExample.getInstance();
        System.out.println(se.print_statement);
    }
}


