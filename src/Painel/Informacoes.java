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
            break;
        }
        else if (veri.equals(pessoa1.nome) && !veri2.equals(pessoa1.senha)){
            System.err.println("senha esta incorreta");
        }
        else if(!veri.equals(pessoa1.nome)&& veri2.equals(pessoa1.senha)){
            System.out.println("nome do ussuario esta incorreto");
        }
        else{
            System.out.print("ussuario nao encontrado\n deseja fazer o cadastro? digite(sim) ou (nao) para voltar para menu->");
            String respost = ler.nextLine();
            if(respost.equals("sim")){
                cadastro();
                break;
            }
            else if(respost.equals("nao")){

            }
            
        }
    
    }
}
    //metodo cadastro
     public static void cadastro(){
        System.out.print("seja muito bem vindo\nantes digite seu nome de ussuario\nnome do usuario->");
        pessoa1.nome = ler.nextLine();
        while(true){
        System.out.print("voce tem certeza desse nome? "+pessoa1.nome+"\n1=sim\n2=nao\n->");
        String resposta = ler.nextLine();
        
        //verificar se ele quer mesmo cadastrar o nome de ussuario
        if(resposta.equals("1")){
            System.out.println("nome salvo com sucesso");
            System.out.print(pessoa1.nome);
            break;
            
        }
        else if(resposta.equals("2")){
          System.out.print("digite novamente.\nnome do ussuario->");
          pessoa1.nome = ler.nextLine();

        }
        else{
            System.out.print("comando nao indentificado 1 ou 2");

        }
        System.out.print("crie uma senha ");
        pessoa1.senha= ler.nextLine();
        while(true){
        System.out.print("voce tem certeza dessa senha "+pessoa1.senha+"? sim ou nao\n->");
        String respost = ler.nextLine();
        if (resposta.equals("1")){
            System.out.print("senha salva!");
            break;
        }
        else if (pessoa1.senha.equals("nao")){
            System.out.print("digite novamente\n->");
            pessoa1.senha = ler.nextLine();
        }
        else{
            System.out.println("comando nao indentificado (sim/nao\ntente novamente)");

        }
        

    }
   
}
        
 
}}
