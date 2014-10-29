package academia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CadastroTurmas {

    private static CadastroTurmas cadT = null;
    private List<Turma> lst;

    private CadastroTurmas() throws IOException {
        lst = new ArrayList<Turma>();
        lst.add(PersistenceLevel.getInstance().loadTurma("TurmaMusculacao.txt", Modalidade.MUSCULACAO));
        lst.add(PersistenceLevel.getInstance().loadTurma("TurmaLocalizada.txt", Modalidade.LOCALIZADA));
        lst.add(PersistenceLevel.getInstance().loadTurma("TurmaSpinning.txt", Modalidade.SPINNING));
    }

    public static CadastroTurmas getInstance() {
        if (cadT == null) {
            try {
                cadT = new CadastroTurmas();
            } catch (IOException e) {
                return (null);
            }
        }
        return (cadT);
    }

    public Turma getTurma(Modalidade modalidade) {
        for (Turma t : lst) {
            if (t.getModalidade() == modalidade) {
                return (t);
            }
        }
        return (null);
    }

    public Turma alunosQueFazemMusculacaoOuLocalizada() {
        Turma muscOuLoc = new Turma("SemProf", Modalidade.QWERY);        
        Turma musc = getTurma(Modalidade.MUSCULACAO);
        Turma loc = getTurma(Modalidade.LOCALIZADA);
        //adiciona todos da modalidade musculação para muscOuLoc;
        for (int i = 0; i < musc.size();i++){
            muscOuLoc.add(musc.get(i));
        }
        
        // Verifica se o aluna da modalidade localizada estão em muscOuLoc, caso não esteja adiciona em muscOuLoc
        for(int i=0; i < loc.size(); i++){
            if(muscOuLoc.isIn(loc.get(i)) == false){
                muscOuLoc.add(loc.get(i));
            }
        }
        // EXERCÍCIO: Termine a implementação deste método.
        return (muscOuLoc);
    }

    public Turma alunosQueFazemMusculacaoESpinning() {
        Turma muscESpin = new Turma("SemProf", Modalidade.QWERY);
        Turma musc = getTurma(Modalidade.MUSCULACAO);
        Turma spin = getTurma(Modalidade.SPINNING);
          for(int i=0; i < musc.size(); i++ ){
              if(spin.isIn(musc.get(i)) == true){
                  muscESpin.add(musc.get(i));
              }
          }
        // EXERCÍCIO: Termine a implementação deste método.
        return (muscESpin);
    }

    public Turma alunosQueFazemTudo() {
        Turma tudo = new Turma("SemProf", Modalidade.QWERY);
        Turma musc = getTurma(Modalidade.MUSCULACAO);
        Turma spin = getTurma(Modalidade.SPINNING);
        Turma loc = getTurma(Modalidade.LOCALIZADA);
          for(int i=0; i < musc.size(); i++ ){
              if(spin.isIn(musc.get(i))&& loc.isIn(musc.get(i)) == true){
                  tudo.add(musc.get(i));
              }
          }
        // EXERCÍCIO: Termine a implementação deste método.
        
        
        return (tudo);
    }

    public Turma alunosQueFazemMusculacaoOuLocalizadaMasNaoSpinning() {
        Turma muscOuLocNaoSpin = new Turma("SemProf", Modalidade.QWERY);
     /*   Turma musc = getTurma(Modalidade.MUSCULACAO);
        Turma spin = getTurma(Modalidade.SPINNING);
        Turma loc = getTurma(Modalidade.LOCALIZADA);
        Turma aux = new Turma("SemProf", Modalidade.QWERY);
        for (int i = 0; i < musc.size();i++){
            aux.add(musc.get(i));
        }
        
        // Verifica se o aluna da modalidade localizada estão em muscOuLoc, caso não esteja adiciona em muscOuLoc
        for(int i=0; i < loc.size(); i++){
            if(aux.isIn(loc.get(i)) == false){
                aux.add(loc.get(i));
            }*/ //EM CONSTRUÇÃO
        
        // EXERCÍCIO: Termine a implementação deste método.
        return (muscOuLocNaoSpin);
    }
}
