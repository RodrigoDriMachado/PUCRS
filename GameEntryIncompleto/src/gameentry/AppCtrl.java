package gameentry;

import java.util.Scanner;

public class AppCtrl {
    private Scores scores;

    public AppCtrl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDigite o numero de scores que voce deseja armazenar:");
        int s = scan.nextInt();
        scores = new Scores(s);
    }

    public void run(){
        UIMenu ui = UIMenu.getInstance();
        while(true){
            int op = ui.selecionaOpcao();
            switch(op){
                case 1:
                    ui.showScores(scores);
                    break;
                case 2:
                    GameEntry ge = ui.entraGameEntry();
                    if (scores.add(ge) == false){
                        ui.showMessage("Score baixo. Não inserido !!");
                    }else{
                        ui.showMessage("Score armazenado !!");
                    }
                    break;
                case 3:
                    scores.reset();
                    ui.showMessage("A lista de scores foi limpa!!");
                    break;
                case 4:
                    ui.showMessage("Encerrando!!");
                    System.exit(0);
            }
        }
    }
}
