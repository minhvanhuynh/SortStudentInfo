
import controller.ManageSortInforStudent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "====== Collection Sort Program ======";
        String[] s = new String[] {"Input Information Student", "Display", "Exit"};
        new ManageSortInforStudent(title, s).run();
    }
}
