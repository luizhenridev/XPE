package designpattern.singleton;

public class BankConnection {
    private static BankConnection instance;
    private Integer a;

    private BankConnection(){}

    public static BankConnection getInstance(){
        if (instance == null) {

            instance = new BankConnection();
            instance.a = 10;
        }
        return instance;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
    
}


class Main {
    public static void main (String[] args){
        BankConnection obj1 = BankConnection.getInstance();
        BankConnection obj2 = BankConnection.getInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj2.getA());

        obj2.setA(20);
        
        System.out.println(obj1.getA());
        System.out.println(obj2.getA());

    }
}
