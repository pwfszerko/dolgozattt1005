package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String FILENAME = "dolgozok.txt";
    ArrayList<Employee> empList = new ArrayList<>();

    public void readFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }

    public void tryReadFile() throws FileNotFoundException {
        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");
        sc.nextLine();

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String lineFree = line.replace("\"", "");
            String[] lineArray = lineFree.split(";") ;
            Employee emp = new Employee();
            emp.setAge(Integer.parseInt(lineArray[0]));
            emp.setName(lineArray[1]); 
            this.empList.add(emp);
            System.out.println(emp.getName());
        }
    }
}
