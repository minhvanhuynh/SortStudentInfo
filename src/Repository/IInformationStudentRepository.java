/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;
import model.InformationStudent;

/**
 *
 * @author This PC
 */
public interface IInformationStudentRepository {  
    
    public void sortStudent(List<InformationStudent> list);
    
    public void display(List<InformationStudent> list);
    
}
