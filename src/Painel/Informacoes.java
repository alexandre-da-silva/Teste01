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
    }
        
    }
}
