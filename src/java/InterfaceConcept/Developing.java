package java.InterfaceConcept;

public class Developing implements BankingClient{
//    now this class is responsible to implement ALL the methods

    public static void main(String[] args) {

        Developing d = new Developing();
        d.checkingbalance();
        d.paycreditcard();
        d.trancferbalance();
        d.login();
        BankingClient b = new Developing();
        b.checkingbalance();
        ((Developing) b).login();



    }

    @Override
    public void paycreditcard() {

        System.out.println("paycreditcard implemented");

    }

    @Override
    public void trancferbalance() {

        System.out.println("transfer implemented");

    }

    @Override
    public void checkingbalance() {

        System.out.println("cheking implemented");

    }

    public void login() {

        System.out.println("I logied in");
    }
}
