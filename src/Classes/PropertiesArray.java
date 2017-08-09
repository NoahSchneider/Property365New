package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesArray {
    public Properties arrProp[] = new Properties[10000];
    private int size = 0;
    public PropertiesArray(String fileName)
    {
        try{
            Scanner scFile = new Scanner(new File(fileName));
            while(scFile.hasNextLine())
            {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                int strtNum =  scLine.nextInt();
                String strtName = scLine.next()+ scLine.next();
                String area = scLine.next();
                int nmBds = scLine.nextInt();
                int nmBths = scLine.nextInt();  
                int price = scLine.nextInt();
                scLine.close();
                arrProp[size] = new Properties(strtNum, strtName, area, nmBds, nmBths, price, sellerID);
                size++;
            }
            scFile.close();
        }
        catch (FileNotFoundException ex) {//catch's FileNotFoundException
            Logger.getLogger(PropertiesArray.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    
}
     public int getSize() {//getSize accessor method returns size of the array
        return size;//returns the int of the size of the array
    }//get size of array method
     public void delete(int position)
     {
         for (int i = size; i >= position; i--) {
             arrProp[i] = arrProp[i-1];
         }
         size++;
     }
     public void insert(int position)
     {
         for (int i = position; i < size - 1; i++) {
             arrProp[i] = arrProp[i + 1];
         }
         size--;
     }
     public String toString()
     {
         String temp = "";
         for (int i = 0; i < size; i++) {
             temp = temp + arrProp[i] + "/n";
         }
         return temp;
     }
      public void writeDetailsToFile(String fileName, int streetNum, String streetName, String area, int numBeds, int numBaths, int price, int sellerID) throws FileNotFoundException {

        
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(streetNum);
        printWriter.print(streetName);
        printWriter.print(area);
        printWriter.print(numBeds);
        printWriter.print(numBaths);
        printWriter.print(price);
        printWriter.print(sellerID);
        printWriter.close();
    }
    
    
}
