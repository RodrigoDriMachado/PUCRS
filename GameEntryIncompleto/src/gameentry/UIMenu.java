package gameentry;

import java.util.Scanner;

public class UIMenu {

    private static UIMenu uiMenu = null;
    private Scanner scan;

    private UIMenu() {
        scan = new Scanner(System.in);
    }

    public static UIMenu getInstance() {
        if (uiMenu == null) {
            uiMenu = new UIMenu();
        }
        return (uiMenu);
    }

    public int selecionaOpcao() {
        int opcao = 0;
        do {
            System.out.println("\n\nOpcoes:");
            System.out.println("<1> Exibir scores");
            System.out.println("<2> Entrar novo score");
            System.out.println("<3> Limpar lista de scores");
            System.out.println("<4> Fim");
            System.out.println("\nDigite sua opcao:");
            opcao = scan.nextInt();
        } while (opcao < 1 || opcao > 4);
        return(opcao);
    }

    public GameEntry entraGameEntry(){
        scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Digite o nome do jogador:");
        String nome = scan.nextLine();
        System.out.println("Digite o score do jogador:");
        int score = scan.nextInt();
        GameEntry ge = new GameEntry(nome,score);
        return(ge);
    }

    public void showMessage(String msg){
        System.out.println("\n"+msg);
    }
    
    public void showScores(Scores scores){
        System.out.println("\n"+scores.toString());
    }
}
