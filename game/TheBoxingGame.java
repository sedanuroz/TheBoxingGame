/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.boxing.game;

/**
 *
 * @author seda
 */
public class TheBoxingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boxer b1=new Boxer("A", 10, 120, 100, 30);
        Boxer b2=new Boxer("B", 20, 85, 85, 40);
        
        Match match=new Match(b1, b2, 85,100);
        match.Run();
    }
    
}
