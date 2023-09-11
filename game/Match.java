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
public class Match {
    Boxer boxer1;
    Boxer boxer2;
    int minWeight;
    int maxWeight;
    
    public Match(Boxer b1,Boxer b2,int minWeight,int maxWeight){
        this.boxer1=b1;
        this.boxer2=b2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    
    public void Run(){
        if(boxer1.weight>=minWeight && boxer1.weight<=maxWeight && boxer2.weight>=minWeight && boxer2.weight<=maxWeight){//eğer kilo şartı sağlanıyorsa 
            
            while(boxer1.health>0 && boxer2.health>0){//her iki sporcununda sağlık durumu iyi olduğu sürece maç yapabilecekler
                if(HitSequence()==0 ){//önce ilk sporcu vuracak
                    System.out.println("********************");
                    this.boxer2.health=this.boxer1.hit(this.boxer2);//ilk boksör vurdu
                    System.out.println(this.boxer2.name+" health :"+this.boxer2.health);
                    if(isWin()){
                        break;
                    }
                    
                    this.boxer1.health=this.boxer2.hit(this.boxer1);//ikici boksör vurdu
                    System.out.println(this.boxer1.name+" health :"+this.boxer1.health);
                     if(isWin()){
                        break;
                    }
                    
                }else{//önce ikinci sporcu vuracak
                      System.out.println("********************");
                 this.boxer1.health=this.boxer2.hit(this.boxer1);//ilk boksör vurdu
                    System.out.println(this.boxer1.name+" health :"+this.boxer1.health);
                    if(isWin()){
                        break;
                    }
                    
                    this.boxer2.health=this.boxer1.hit(this.boxer2);//ikici boksör vurdu
                    System.out.println(this.boxer2.name+" health :"+this.boxer2.health);
                     if(isWin()){
                        break;
                    }
                    
                }
            }
            
            
            
        }else{
            System.out.println("Sporcuların sikletleri uygun değildir.");
        }
    }
    
    public int HitSequence(){
        int random=(int)(Math.random()*2);//sıfır ile 2 arasında değer üretecek yani ya 0 yada 1 değerini alacak
        return random;
}
    
     public boolean isWin() {
        if (this.boxer1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.boxer2.name);
            return true;
        } else if (this.boxer2.health == 0){
            System.out.println("Maçı Kazanan : " + this.boxer1.name);
            return true;
        }

        return false;
    }

}
