package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Matheus Julidori",123456,3);
        Endereco e1 = new Endereco("Rua a","Inatel",3);
        Endereco e2 = new Endereco("Rua b","Por do sol",56);
        Endereco e3 = new Endereco("Rua c","Monte Libano",12);

        p.addEndereco(e1);
        p.addEndereco(e3);
        p.addEndereco(e2);

        p.mostraInfo();

    }

}
