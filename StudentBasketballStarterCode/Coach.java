import java.text.*;
import java.io.*;
/**
 * Coach class - a coach of the basketball team
 * 
 * @author David Garry
 * 
 */
public class Coach
{
    private String name;
    private int wins;
    private int loses;
    /**
     * Class will write a description together here
     */
    public Coach(){
        this("Mickey D",0,0);
    }
    /**
     * Class will write a description together here
     */
    public Coach(String name){
        this(name,0,0);
    }
    /**
     * Class will write a description together here
     */
    public Coach(String name, int wins, int loses){
        this.name = name;
        this.wins = wins;
        this.loses = loses;
    }
    /**
     * Class will write a description together here
     */
    public void addLoss(){
        this.loses++; //same as loses++? Yes!
    }
    /**
     * Class will write a description together here
     */
    public void addWin(){
        this.wins++; //same as wins++? Yes!
    }
    /**
     * Class will write a description together here
     */
    public double getWinRatio(){
        return (double) Math.round(((double)wins)/((double)(loses+wins))*100.0)/100.0;
        //same as (wins/loses)? No!
        //same as (double)(wins/loses)? No!
    }
    public String getName(){
        return name;
    }
    public int getWins(){
        return wins;
    }
    public int getLoses(){
        return loses;
    }
    /**
     * Class will write a description together here
     */
    public void print(){
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("        Coach: "+getName());
            System.out.println("            Wins: "+getWins());
            System.out.println("            Loses: "+getLoses());
            System.out.println("            Ratio: "+df.format(getWinRatio()*100)+"%");
    }
}
