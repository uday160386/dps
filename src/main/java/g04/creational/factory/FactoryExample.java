package g04.creational.factory;

public class FactoryExample implements FE {

    String firstName;
    String lastName;

    FactoryExample(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void firstName() {
        System.out.println(this.firstName);
    }

    @Override
    public void lastName() {
        System.out.println(this.lastName);
    }

    @Override
    public String fullName() {
        return this.firstName+" "+ this.lastName;

    }
}

