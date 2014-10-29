package gameentry;

import java.util.ArrayList;
import java.util.List;

public class Scores {

    private int maxEntries;
    private ArrayList<GameEntry> scores;

    public Scores() {
        maxEntries = 5;
        scores = new ArrayList<GameEntry>(maxEntries);
    }

    public Scores(int maxEntries) {
        if (maxEntries>0)
            this.maxEntries = maxEntries;
        else
            maxEntries = 5;
        scores = new ArrayList<GameEntry>(maxEntries);
    }

   public boolean add(GameEntry ge) {
       if(scores.isEmpty()){
                scores.add(ge);
                return true;
        }
       else if(scores.size()==maxEntries && ge.getScore() < scores.get(maxEntries-1).getScore()){
           return false;
       }               
       else{
         for(int i=0; i< scores.size();i++){
             
             if(scores.get(i).getScore()<ge.getScore()){
                scores.add(i,ge);
                return true;
            }
            else{
                scores.add(scores.size(),ge);
            }
            
        }
         return false;
       }
        
      
        
    }
    
    public void reset() {
        scores = new ArrayList<GameEntry>(maxEntries);
    }

    @Override
    public String toString() {
        if (scores.isEmpty()) {
            return ("Lista vazia !!");
        } else {
            StringBuilder sb = new StringBuilder();
            for (GameEntry ge : scores) {
                sb.append(ge.toString());
                sb.append("\n");
            }
            return (sb.toString());
        }
    }
}
