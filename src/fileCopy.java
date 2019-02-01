import javax.swing.*;
import java.io.*;

public class fileCopy {

    public static void textCopy(String fileName) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Copy_of_" + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);

        FileReader fr = null;
        try {
            fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFil = new BufferedReader(fr);
        
        String i = "";
        try {
            i = inFil.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        while(i != null){
            try {
                utFil.println(i);
                i = inFil.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        utFil.flush();
        utFil.close();
    }

    public static void binaryCopy(String fileName){
        try {
            DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream("myData.dat")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("myData.dat")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog(null, "Filnamn?");

        int choice = JOptionPane.showOptionDialog(null, "Binärt eller Text?",
                "Välj ett alternativ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, new String[]{"Binärt", "Text"},null);

        if(choice == 0) binaryCopy(fileName);
        else if(choice == 1) textCopy(fileName);
        else System.out.println("fel");
    }
}
