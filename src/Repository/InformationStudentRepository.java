/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.InformationStudentDao;
import java.util.List;
import model.InformationStudent;

/**
 *
 * @author This PC
 */
public class InformationStudentRepository implements IInformationStudentRepository{

    @Override
    public void sortStudent(List<InformationStudent> list) {
        InformationStudentDao.Instance().sortInforStudent(list);
    }

    @Override
    public void display(List<InformationStudent> list) {
        if(list.isEmpty()){
            System.err.println("List is empty!");
            return;
        }
        for(int i=0; i<list.size(); i++){
            System.out.println("------ Student "+(i+1)+" ------");
            System.out.print("Name: "+list.get(i).getName());
            System.out.println("");
            System.out.print("Classes: "+list.get(i).getClasses());
            System.out.println("");
            System.out.print("Mark: "+list.get(i).getMark());
            System.out.println("");
        }
    }
    
}
