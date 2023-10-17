/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IInformationStudentRepository;
import Repository.InformationStudentRepository;
import java.util.ArrayList;
import java.util.List;
import model.InformationStudent;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageSortInforStudent extends Menu<String>{
    
    private IInformationStudentRepository infor= new InformationStudentRepository();
    private List<InformationStudent> list= new ArrayList<>();
    
    
    public ManageSortInforStudent(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                infor.sortStudent(list);
                break;
            case 2:
                infor.display(list);
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
}
