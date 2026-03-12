package Painel;
import users.Usuario;

import java.util.Scanner;

public class Informacoes {
    public static Scanner ler = new Scanner(System.in);
    //pessoa 1 criada
    public static Usuario pessoa1 = new Usuario();
    //
    //metodo logar
    public static void logar(){
        while(true){
        System.out.print("digite o nome do ussuario:");
        String veri = ler.nextLine();
        System.out.print("digite a senha:");
        String veri2  = ler.nextLine();
        if(veri.equals(pessoa1.nome)&&pessoa1.senha.equals(veri2)){
            System.out.print("seja bem vindo novamente");
            System.exit(0);
            break;
        }
        else if (veri.equals(pessoa1.nome) && !veri2.equals(pessoa1.senha)){
            System.err.println("senha esta incorreta");
        }
        else if(!veri.equals(pessoa1.nome)&& veri2.equals(pessoa1.senha)){
            System.out.println("nome do ussuario esta incorreto");
        }
        else{
            System.out.print("ussuario nao encontrado digite (1) para tentar novamente ou (2) para cadastrar ou (3) para voltar ao menu\n->");
            String respost = ler.nextLine();
            if(respost.equals("1")){
            }
            else if(respost.equals("2")){
                cadastro();
                break;
            }
            else if(respost.equals("3")){
            menu();
            break;
            }
            else{
                System.out.println("comando invalido");
            }
            
        }
    
    }
}
    //metodo cadastro
     public static void cadastro(){
        System.out.print("seja muito bem vindo\ndigite o que voce deseja ussar de ussuario\nnome do usuario->");
        pessoa1.nome = ler.nextLine();
        while(true){
        System.out.print("voce tem certeza desse nome? "+pessoa1.nome+"\n1=sim\n2=nao\n->");
        String resposta = ler.nextLine();
        
        //verificar se ele quer mesmo cadastrar o nome de ussuario
        if(resposta.equals("1")){
            System.out.println("nome salvo com sucesso");
            System.out.print(pessoa1.nome);
            System.out.print(" crie uma senha\n->");
        pessoa1.senha= ler.nextLine();
        while(true){
        System.out.print("voce tem certeza dessa senha "+pessoa1.senha+"? sim ou nao\n->");
        String respost = ler.nextLine();
        if (resposta.equals("1")){
            System.out.println("senha salva!");
            menu();
            break;
        }
        else if (pessoa1.senha.equals("nao")){
            System.out.print("digite novamente\n->");
            pessoa1.senha = ler.nextLine();
        }
        else{
            System.out.println("comando nao indentificado (sim/nao)\ntente novamente->");

        }
        

    }
            
        }
        else if(resposta.equals("2")){
          System.out.print("digite novamente.\nnome do ussuario->");
          pessoa1.nome = ler.nextLine();

        }
        else{
            System.out.print("comando nao indentificado 1 ou 2");

        }
   
}
} 
public static void menu(){
        while(true){
        System.out.print("1: cadastrar.\n2:logar\n3:sair\n->");
        String resposta = Informacoes.ler.nextLine();
        if(resposta.equals("1")){
            //cadastrar
            Informacoes.cadastro();
            break;
        }
        if(resposta.equals("2")){
            //logar
            Informacoes.logar();
            break;
        }
        if(resposta.equals("3")){
            //sair
            System.out.println("saindo...");
            System.exit(0);
            break;
        }
        else if(!resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3")){
            //se ussuario digitar algo diferte de sair,cadastrar ou logar
            System.out.println("comando invalido didite novamente 1 ou 2 ou 3");
        }
    }
    ler.close();
}

}
