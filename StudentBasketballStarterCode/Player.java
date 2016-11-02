import java.text.*;
import java.io.*;
/**
 * Player class - a player on the basketball team
 * 
 * @author David Garry
 * 
 */
public class Player
{
    private String name;
    private int number, height, weight;
    private int shotsTaken, shotsMade, assists, minutesPlayed;
    /**
     * Class will write a description together here
     */
    public Player(int number, String name, int height, int weight){
        this(number, name, height, weight, 0, 0, 0, 0);
    }
    /**
     * Class will write a description together here
     */
    public Player(int number, String name, int height, int weight, int shotsTaken, int shotsMade, int assists, int minsPlayed){
        this.number = number;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.shotsTaken = shotsTaken;
        this.shotsMade = shotsMade;
        this.assists = assists;
        this.minutesPlayed = minsPlayed;
    }
    /**
     * Class will write a description together here
     */
    public void setHeight(int in){
        this.height = in; //emphasize that in could be named anything
    }
    /**
     * Class will write a description together here
     */
    public void setWeight(int in){
        this.weight = in; //emphasize that in could be named anything
    }
    /**
     * Class will write a description together here
     */
    public void missedShot(){
        shotsTaken++;
    }
    /**
     * Class will write a description together here
     */
    public void madeShot(){
        shotsTaken++;
        shotsMade++;
    }
    /**
     * Class will write a description together here
     */
    public void assisted(){
        assists++;
    }
    /**
     * Class will write a description together here
     */
    public void playedMins(int in){
        minutesPlayed += in;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public int getShotsTaken(){
        return shotsTaken;
    }
    public int getShotsMade(){
        return shotsMade;
    }
    public int getAssists(){
        return assists;
    }
    public int getMinutesPlayed(){
        return minutesPlayed;
    }
    public double getShootingAverage(){
        return Math.round((double)shotsMade/(double)shotsTaken *100.0)/100.0;
    }
    public double getOverallScore(){
        return Math.round( ((getShootingAverage()*100.0+assists)/(double)minutesPlayed) * 100.0) /100.0;
    }
    /**
     * Class will write a description together here
     */
    public void print(){
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("        Player: "+getNumber()+", "+getName());
            System.out.println("            Height: "+getHeight() +" inches");
            System.out.println("            Weight: "+getWeight() +" lbs");
            System.out.println("            Shooting Average: "+df.format(getShootingAverage()*100)+"%");
            System.out.println("            Overall Score: "+df.format(getOverallScore()));
    }
}