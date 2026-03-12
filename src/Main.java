import Painel.Informacoes;
public class Main {
    public static void main(String[]args){
        System.out.println("ola bem vindo,");
        menu(); 
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
            break;
        }
        else if(!resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3")){
            //se ussuario digitar algo diferte de sair,cadastrar ou logar
            System.out.println("digite novamente 1 para cadastrar 2 para logar e 3 sair");
        }
    }}
    
}