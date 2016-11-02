import java.util.*;

public class TeamUSC
{
    private static ArrayList<Coach> coaches;
    private static ArrayList<Player> players;
    private static String fileName;
    private Encapsulation help;
    /**
     *  YOUR DESCRIPTION HERE
     */
    public TeamUSC()
    {
        coaches = new ArrayList<Coach>();
        players = new ArrayList<Player>();
        fileName = "roster.txt";
        help = new Encapsulation(coaches, players, fileName);
        //do we have any coaches or players yet? No!
        main();
    }

    /**
     *  YOUR DESCRIPTION HERE
     */
    private void main(){
        help.populateRoster();
    }

    /**
     *  YOUR DESCRIPTION HERE
     */
    public void sort(){
        help.sort();
    }

    /**
     * TO BE COMPLETED
     */
    public void printPlayer(String nameOfPlayer){
        //YOUR CODE HERE
    }

    /**
     * TO BE COMPLETED
     */
    public void printPlayer(int numberOfPlayer){
        //YOUR CODE HERE
    }

    /**
     * TO BE COMPLETED
     */
    public void printBestPlayer(){
        //YOUR CODE HERE
    }

    /**
     * TO BE COMPLETED
     */
    public void printShortestPlayer(){
        //YOUR CODE HERE
    }

    /**
     * TO BE COMPLETED
     */
    public void printLightestPlayer(){
        if(players.size() == 0)
        {
            System.out.println("Error: No Players Have Been Created Yet!");
        } else {
            int weight = players.get(0).getWeight();
            int indexOfPlayer =0;
            for(int i=0; i<players.size(); i++)
            {
                if(players.get(i).getWeight() < weight)
                {
                    weight = players.get(i).getWeight();
                    indexOfPlayer = i;
                }
            }
            players.get(indexOfPlayer).print();
        }
    }

    /**
     * TO BE COMPLETED
     */
    public void printTallestPlayer(){
        //YOUR CODE HERE
    }

    public void printHeaviestPlayer(){
        int weight = -1;
        int indexOfPlayer =-1;
        for(int i=0; i<players.size(); i++)
        {
            if(players.get(i).getWeight() > weight)
            {
                weight = players.get(i).getWeight();
                indexOfPlayer = i;
            }
        }
        if(indexOfPlayer != -1)
        {
            players.get(indexOfPlayer).print();
        } else {
            System.out.println("Error: No Players Have Been Created Yet!");
        }
    }

    /**
     *  YOUR DESCRIPTION HERE
     */
    public void printAllStats(){
        System.out.println("File: " + fileName);
        System.out.println("*************** TEAM USC ***************\n\n");
        System.out.println("    *** COACHES ***\n");
        for(int i=0; i<coaches.size(); i++)
        {
            coaches.get(i).print();
        }
        System.out.println();
        System.out.println("    *** PLAYERS ***\n");
        for(int k=0; k<players.size(); k++)
        {
            players.get(k).print();
        }
    }
}
