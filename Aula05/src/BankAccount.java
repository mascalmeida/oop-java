// Bank account example. Create a bank account class with the follow requisites:
// Attributes: + numConta, # tipo (cc or cp), - dono (name), - saldo, - status (true or false).
// Methods: + abrirConta(){cc=50; cp=150;}, + fecharConta(){saldo=0}, + depositar(){status=true}, + sacar(){status=true; saldo>s;}, + pagarMensal(){cc=12;cp=20;}.
// All special methods: getters, setters and construct{saldo=0 & status=false}.

import java.util.Random;

public class BankAccount {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public BankAccount() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void generalStatus() {
        System.out.println("-------------------------------");
        System.out.println("Account number: " + this.numConta);
        System.out.println("Account type: " + this.getTipo());
        System.out.println("Owner name: " + this.getDono());
        System.out.println("Account balance: " + this.getSaldo());
        System.out.println("Is account open? " + this.isStatus());
        System.out.println("-------------------------------");
    }

    public void abrirConta(String t, String n){
        if (t == "cc") {
            this.tipo = "cc";
            this.status = true;
            this.saldo = 50f;
            this.dono = n;

            Random rand = new Random();
            int account_random_number = rand.nextInt(10000);

            this.numConta = account_random_number;

            System.out.println("Congrats! Your checking account is opened. This is your current status:");
            this.generalStatus();
        }else {
            if (t == "cp"){

                this.tipo = "cp";
                this.status = true;
                this.saldo = 150f;
                this.dono = n;

                Random rand = new Random();
                int account_random_number = rand.nextInt(10000);

                this.numConta = account_random_number;

                System.out.println("Congrats! Your savings account is opened. This is your current status:");
                this.generalStatus();
            }else {
                System.out.println("This Bank only accepts checking account (cc) or savings account (cp). Please, enter cc or cp code.");
            }
        }
    }

    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.status = false;
            System.out.println("Your account is closed.");
            this.generalStatus();
        } else if(this.getSaldo() > 0) {
            System.out.println("To close your account you have to remove all money from there. Your current balance is: " + this.getSaldo());
        } else System.out.println("To close your account you have to pay all debts from there. Your current balance is: " + this.getSaldo());
    }

    public void depositar(float d){
        if (this.isStatus() == true){
            this.setSaldo(this.getSaldo() + d);
            System.out.println("Deposit process is done. Your new balance is: " + this.getSaldo());
        }else System.out.println("This account is closed. Open first to do a deposit.");
    }

    public void sacar(float s){
        if ((this.isStatus() == true) && (this.getSaldo() >= s)){
            this.setSaldo(this.getSaldo() - s);
            System.out.println("The withdraw process is done. " + s + " was removed from your account, your current balance now is: " + this.getSaldo());
        }else if (this.isStatus() == false) System.out.println("This account is closed. Open first to do an withdraw."); else{
            if (this.getSaldo() < s) System.out.println("You don't have enough money. Your current balance is: " + this.getSaldo());
        }
    }

    public void pagarMensal(){
        if(this.isStatus() == true){
            if (this.getTipo() == "cc"){
                if (this.getSaldo() >= 12){
                    this.setSaldo(this.getSaldo() - 12);
                    System.out.println("Thanks for the payment, your current balance is: " + this.getSaldo() + " See you next month!");
                } else System.out.println("You don't have enough money. Your current balance is: " + this.getSaldo());
            } else {
                // cp
                if (this.getSaldo() >= 20){
                    this.setSaldo(this.getSaldo() - 20);
                    System.out.println("Thanks for the payment, your current balance is: " + this.getSaldo() + " See you next month!");
                } else System.out.println("You don't have enough money. Your current balance is: " + this.getSaldo());
            }
        }
    }
}
