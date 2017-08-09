package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sellers {

    private String sellerFirstName, sellerSurname, sellerUsername, sellerPassword, sellerCellNum;
    private int sellerID;

    public Sellers(int i, String n, String s, String c, String u, String p) {
        sellerID = i;
        sellerFirstName = n;
        sellerSurname = s;
        sellerCellNum = c;
        sellerUsername = u;
        sellerPassword = p;
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

   
    public String toString()
     {
         String temp;
         temp = sellerID + " " + sellerFirstName + " " + sellerSurname + 
                 " " + sellerCellNum + " " + sellerUsername + " " + sellerPassword;
         return temp;
     }

   
}
