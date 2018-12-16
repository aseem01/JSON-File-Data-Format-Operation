/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.file.data.format.operation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author ASHIM
 */
public class WriteJsonFile {
    public static void main(String []args) throws IOException{
        Country CountryObj=new Country();
        CountryObj.setName("Bangladesh");
        CountryObj.setPopulation(200000);
        List<String>list=new ArrayList<String>();
        list.add("Dhaka");
        list.add("Sylhet");
        list.add("Chittagong");
        list.add("Rangpur");
        list.add("Commilla");
        CountryObj.setStates(list);
        ObjectMapper mapper=new ObjectMapper();
        
        try{
             mapper.writeValue(new File("Sample.json"),CountryObj);
        }catch(Exception e){
           e.printStackTrace();
        }
        
        
    }
    
}
