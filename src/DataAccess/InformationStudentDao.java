/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import java.util.Collections;
import java.util.List;
import model.InformationStudent;
import view.Validation;

/**
 *
 * @author This PC
 */
public class InformationStudentDao {
    
    private static InformationStudentDao instance= null;
    private Validation validation;
    
    public InformationStudentDao(){
        validation= new Validation();
    }
    
    
    public static InformationStudentDao Instance(){
        if(instance==null){
            synchronized (InformationStudentDao.class) {
                if(instance==null){
                    instance= new InformationStudentDao();
                }
            }
        }
        return instance;
    }
    
    public void sortInforStudent(List<InformationStudent> list){
        while(true){
            System.out.println("Please input student information");
            System.out.print("Name: ");
            String name= validation.checkInputString();
            System.out.print("Classes: ");
            String classes= validation.checkInputString();           
            float mark= validation.checkInputFloat("Mark: ");
            InformationStudent infor= new InformationStudent(name, classes, mark);
            list.add(infor);
            Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
}
