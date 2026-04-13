public class Conta {
    private double saldo;
    private double limiteChequeEspecial;

    // criando construtor da conta bancaria
    public Conta(double saldoInicial, double limiteChequeEspecial) {
        this.saldo = saldoInicial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // usando get para pegar o que esta privado
    public double getSaldo() {
        return saldo;
    }
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void depositar(double valor){
        if (valor > 0 && valor < 500){
            saldo += valor;
            limiteChequeEspecial += 50;
            System.out.println("Desposito realizado com sucesso. Novo saldo: R$ " + saldo);
            System.out.println("Novo limite cheque especial: " + limiteChequeEspecial);
        } else if (valor >= 500){
            saldo += valor;
            System.out.println("Desposito realizado com sucesso. Novo saldo: R$ " + saldo);
            limiteChequeEspecial += valor * 0.50;
            System.out.println("Novo limite cheque especial: " + limiteChequeEspecial);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void pagarBoleto(double valor){
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para pagamento.");
        }
    }
    public boolean estaChequeEspecial(){
        return saldo < 0;
    }
}

