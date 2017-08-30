package matchtracker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * Brendan Waters
 * Oct 2, 2015 10:36:36 PM
 * Brenardo9956@gmail.com
 */
public class Match {
    
    
    
    /**
     * Fields
     */
    String hero;
    String archetype;
    String opHero;
    String opArchetype;
    String outcome;
    
    public Match(){
        
        hero = null;
        archetype = null;
        opHero = null;
        opArchetype = null;
        outcome = null;
        
    }
    
    /**
     * Setters
     */
    void SetHero(String s) throws Exception{
        
        //normalize s
        s = s.toLowerCase();
        
        //check if valid hero type
        if(Main.HEROES.contains(s)){
            hero = s;
        }else{
            throw new Exception("Invalid Hero");
        }
    }
    void SetArchetype(String s) throws Exception{
        
        s = s.toLowerCase();
        
        if(Main.ARCHETYPES.contains(s)){
            archetype = s.toLowerCase();
        }else{
            throw new Exception("Invalid Archetype");
        }
    }
    void SetOpHero(String s) throws Exception{
        
        s = s.toLowerCase();
        
        if(Main.HEROES.contains(s)){
            opHero = s.toLowerCase();
        }else{
            throw new Exception("Invalid Opponent Hero");
        }
    }
    void SetOpArchetype(String s) throws Exception{
        
        s = s.toLowerCase();
        
        if(Main.ARCHETYPES.contains(s)){
            opArchetype = s.toLowerCase();
        }else{
            throw new Exception("Invalid Opponent Archetype");
        }
    }
    void setOutcome(String s) throws Exception{
        
        s = s.toLowerCase();
        
        if(Main.OUTCOMES.contains(s)){
            outcome = s.toLowerCase();
        }else{
            throw new Exception("Invalid Outcome");
        }
    }
    
    /**
     * Getters
     */
    String getHero(){
        return hero;
    }
    String getArchetype(){
        return archetype;
    }
    String getOpHero(){
        return opHero;
    }
    String getOpArchetype(){
        return opArchetype;
    }
    String getOutcome(){
        return outcome;
    }

    void WriteToFile() {
        
        BufferedWriter writer = null;
        
        try{
            
            writer = new BufferedWriter(new FileWriter(Main.FILEPATH, true));
            writer.write(hero + " " + archetype + " " + opHero + " " + opArchetype + " " + outcome + " ");
            writer.newLine();
            writer.flush();
            
        }catch(IOException ex){            
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);            
        }finally{            
            if(writer != null){                
                try{                    
                    writer.close();
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
}
