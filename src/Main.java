public class Main{
	public static void main(String[] args){
		Cliente alex = new Cliente();
		alex.setNome("Alex");
		Conta cc = new ContaCorrente(alex);
		Conta poupanca = new ContaPoupanca(alex);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
