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
public class Boxer {
    public String name;
    public int damage;
    public int health;
    public int weight;
    public int  dodge;//kaçınmak
    
    public Boxer(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (this.dodge >= 0 && this.dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
     
    }
    
    int hit(Boxer boxer ){//buradaki boxer hasarı alack olan boksör
         System.out.println(this.name + " => " + boxer.name + " " +  this.damage + " hasar vurdu.");
         if(isDodge(boxer)==true){//saldırıyı bloklayabilir mi
             System.out.println(boxer.name+ " gelen saldırıyı blokladı.");
             return boxer.health;
         }
       if(boxer.health-this.damage<0){
           return 0;
       }
         return boxer.health-this.damage;

    }
    
    boolean isDodge(Boxer b){
        double random=Math.random()*100;
        return this.dodge<=random;
    }
    
}
