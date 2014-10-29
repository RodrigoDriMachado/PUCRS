/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/*
•public double getMediaTotalFuncSobSupervPeloMestreDeObras()
•public double getMediaSalarioMestreDeObras()
•public boolean isIn(int codigo)
•public Funcionario getFuncionario(int codigo)
•public String getListaNomesSalariosLiquidos()
•public void remove(int codigo)
•public Funcionario get(int i)
•public String toString()

*/

package aulaherenca;


import java.util.ArrayList;

public class CadastroFuncionarios {
    
     private ArrayList<Funcionario> listaFuncionario;
     private int cont;
      
     private static CadastroFuncionarios cad = null;

    private CadastroFuncionarios() {
       listaFuncionario = new ArrayList<>();
    }
    
    public static CadastroFuncionarios getInstance() {
        if (cad == null) {
            cad = new CadastroFuncionarios();
        }
        return cad;
    }
    
      public boolean add(Funcionario f) {
        cont++;
        return listaFuncionario.add(f);
    }
      
      public int getTotalMotoristasCadastrados(){
          int contMotorista=0;
          for(int i =0; i<= listaFuncionario.size();i++){
              if(listaFuncionario.get(i) instanceof Motorista == true){
                  contMotorista++;
              }    
          }
          return contMotorista;
      }
      
      public int size(){
          return cont;
      }
      
   
}
