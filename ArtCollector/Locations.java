/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArtCollector;

import java.util.ArrayList;

/**
 *
 * @author Rich
 */
public class Locations {
    
    
    Location[] Locations = new Location[6];
    
    public Locations(){       
    
    }
    
//    public void createAndAddLoc(char suffix) {
//        
//    Location newL = new Location(suffix);
//    Locations.add(newL);
//        
//    }
    
    public void initLocations(){
        
        
        Location newL = new Location('A');
        Locations[0] = newL;
        
        newL = new Location('B');
        Locations[1] = newL;
        
        newL = new Location('C');
        Locations[2] = newL;
        
        newL = new Location('D');
        Locations[3] = newL;
        
        newL = new Location('E');
        Locations[4] = newL;
        
           
        
    }
    
    public int searchSuffix(char suffix){
        
        for(int i = 0; i < 6; i++){
            
            if(Locations[i].getSuffix() == suffix){
                return i;
                
            }
            
        }
        
        return 0;
    }

    public Location[] getLocations() {
        return Locations;
    }
    
}
