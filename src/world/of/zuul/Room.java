package world.of.zuul;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class Room 
{
    private String description;
    private HashMap<String, Room> exits; //hashmap erstatter array 

    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    public String getShortDescription()
    {
        return description; //beskrivelse af rummet
    }

    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString(); //du er nu her 
    }

    private String getExitString() //hvad veje kan du gå i det pågældende rum
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) { 
            returnString += " " + exit;
        }
        return returnString;
    }

    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
}

