package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SellersArray {

    public Sellers arrSellers[] = new Sellers[100000];
    private int size = 0;
    int sellerID;
    String sellerFirstName, sellerSurname, sellerCellNum, sellerUsername, sellerPassword;

    public SellersArray() {
        try {
            Scanner scFile = new Scanner(new File(""));
            while (scFile.hasNextLine()) {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                sellerID = scLine.nextInt();
                sellerFirstName = scLine.next();
                sellerSurname = scLine.next();
                sellerCellNum = scLine.next();
                sellerUsername = scLine.next();
                sellerPassword = scLine.next();
                scLine.close();
                arrSellers[size] = new Sellers(sellerID, sellerFirstName,sellerSurname, sellerCellNum,sellerUsername, sellerPassword);
                size++;
            }
            scFile.close();
        } catch (FileNotFoundException ex) {//catch's FileNotFoundException
            Logger.getLogger(SellersArray.class.getName()).log(Level.SEVERE, null, ex);
            {
            }
        }
    }
    public int getSellerID() {
        return sellerID;
    }

    public String getSellerName() {
        return sellerFirstName;
    }

    public String getSellerCellNum() {
        return sellerCellNum;
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public int getSize() {//getSize accessor method returns size of the array
        return size;//returns the int of the size of the array
    }//get size of array method
    public String toString()
     {
         String temp = "";
         for (int i = 0; i < size; i++) {
             temp = temp + arrSellers[i] + "/n";
         }
         return temp;
     }
     public void writeDetailsToFile(String fileName, int i, String n, String s, String c, String u, String p) throws FileNotFoundException {

        
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(i);
        printWriter.print(n);
        printWriter.print(s);
        printWriter.print(c);
        printWriter.print(u);
        printWriter.print(p);
        printWriter.close();
    }
     public void emptyTemporaryDetailsTextFile() throws FileNotFoundException, IOException
     {
         FileWriter fileClear = new FileWriter("TemporaryDetails.txt");
         fileClear.flush();
         
         
     }
}
