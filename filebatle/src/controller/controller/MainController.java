package controller;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import models.Employee;
import models.Filereader;
import views.MainConsole;

class MainController {
    public MainController() {
        ArrayList<Employee> empList = new FileReader(filebatle/src/filbt.txt).readFile();
        new MainConsole().showData(empList);
        MainConsole console = new MainConsole();
        List<Employee> employees;
        console.showData(employees);
    }
}