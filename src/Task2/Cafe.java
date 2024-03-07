package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();
    public void loadMenuData() {

        try {
            File file = new File("src/Task2/coffees.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                    coffeeMenu.add(scan.nextLine());
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found. Check path and filename");

        }

    }

    @Override
    public String toString() {
        String output = "";
        for (String coffee : coffeeMenu) {
            output += coffee + " ";
        }
        return output;
    }
}
