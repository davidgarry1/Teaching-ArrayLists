import java.io.*;
import java.text.*;
import javax.swing.*;
import java.net.URL;
import java.util.*;
/**
 * Don't worry about this class. This is an example of encapsulation - using a class' methods without actually
 * needing to understand how they are implemented.
 * 
 * @author David Garry
 * 
 */
public class Encapsulation
{
    private static ArrayList<Coach> coaches;
    private static ArrayList<Player> players;
    private static String fileName;
    public Encapsulation(ArrayList<Coach> coaches, ArrayList<Player> players, String fileName)
    {
        this.coaches = coaches;
        this.players = players;
        this.fileName = fileName;
    }

    /**
     * Don't worry about this method
     */
    public void populateRoster(){
        try{
            InputStream fstream = openFile(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fstream));
            String line = in.readLine();
            while(line != null) {
                String[] parsedLine = line.split("::");
                try {
                    String[] parsedHeight = parsedLine[2].split("-");
                    players.add(new Player(Integer.parseInt(parsedLine[0]),parsedLine[1],Integer.parseInt(parsedHeight[0])*12+Integer.parseInt(parsedHeight[1]), 
                    Integer.parseInt(parsedLine[3]),Integer.parseInt(parsedLine[4]),Integer.parseInt(parsedLine[5]), Integer.parseInt(parsedLine[6]),Integer.parseInt(parsedLine[7])));
                } catch (NumberFormatException e) {
                    coaches.add(new Coach(parsedLine[0],Integer.parseInt(parsedLine[1]),Integer.parseInt(parsedLine[2])));
                } catch (Exception e) {
                    System.out.println("Error in parsing file.");
                }
                line = in.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
    }

    /**
     * Don't worry about this method
     */
    public InputStream openFile(String fileName) throws IOException
    {
        if(fileName == null){
            throw new IOException("Cannot open file - filename was null.");
        }
        URL url = getClass().getClassLoader().getResource(fileName);
        if(url == null){
            throw new IOException("File not found: " + fileName);
        }
        return url.openStream();
    }

    /**
     * Don't worry about this method
     */
    public void sort(){
        Collections.sort(players, new Comparator<Player>(){
                public int compare(Player object1, Player object2) {
                    return (int)(object2.getOverallScore()*10000 - object1.getOverallScore()*10000);
                }
            });
        Collections.sort(coaches, new Comparator<Coach>(){
                public int compare(Coach object1, Coach object2) {
                    return (int)(object2.getWinRatio()*10000 - object1.getWinRatio()*10000);
                }
            });
    }
}
