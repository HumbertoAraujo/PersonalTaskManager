/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalTaskManager;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Humberto
 */
public class Main {
    
    public static void main(String[] args) {
        
         
        ProjectController projectController = new ProjectController();
       
        Project project = new Project();
        project.setName("Projeto 2");
        project.setDescription("Description teste");
        projectController.save(project);
        
        
        
    }

}

