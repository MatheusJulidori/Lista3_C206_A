package br.inatel.cdg;

public class Pessoa {

    public String nome;
    public int cpf;
    public Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end){
        for(int i = 0;i< enderecos.length;i++){
            if(enderecos[i] == null){
                enderecos[i] = end;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        int i = 1;
        for(Endereco end : enderecos){
            if(end!=null){
                System.out.println("Endereço "+i);
                System.out.println(end.rua+", "+end.num+", "+end.bairro );
                i++;
            }
        }
    }

}
