/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.file.data.format.operation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASHIM
 */
public class CreateJsonFile {

    public static String filename() {
        String fileName = "Sample_";
        String CurrentTime = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        fileName += CurrentTime;
        return fileName;
    }

    public static void main(String[] args) {
        File file = new File("Sample.json");
        //If Sample.json file isn't create in project directory,then if conditions is working here and create file;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CreateJsonFile.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        //If file already created here then new file will be created here;
        else if (file.exists()) {
            try {
                System.out.println("File : " + CreateJsonFile.filename());
                String filename = CreateJsonFile.filename() + ".json";
                System.out.println(filename);
                file = new File(filename);
                // file = new File("Sample1.json");
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(CreateJsonFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
