// Bank account example. Create a bank account class with the follow requisites:
// Attributes: + numConta, # tipo (cc or cp), - dono (name), - saldo, - status (true or false).
// Methods: + abrirConta(){cc=50; cp=150;}, + fecharConta(){saldo=0}, + depositar(){status=true}, + sacar(){status=true; saldo>s;}, + pagarMensal(){cc=12;cp=20;}.
// All special methods: getters, setters and construct{saldo=0 & status=false}.
// 34620478 33669956
public class Main {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount();
        c1.abrirConta("cp", "Jubileu");
        c1.setSaldo(-50f);
        c1.fecharConta();
        c1.depositar(1000f);
        c1.pagarMensal();
        c1.sacar(c1.getSaldo());
        c1.fecharConta();
    }
}