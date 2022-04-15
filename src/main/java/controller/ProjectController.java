/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author humberto
 */
public class ProjectController {

    public void save(Project project) {

        String sql = "INSERT INTO projects (name, "
                + "description, "
                + "createdAt, "
                + "updatedAt) "
                + "VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conexão com o banco.
            connection = ConnectionFactory.getConnection();
            //Cria um PrepareStatement, classe usada para executar a query.
            statement = connection.prepareStatement(sql);

            //Insere os dados para substituir os ? .
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
          
            //Executa a sql para a inserção dos dados
            statement.execute();

        } catch (SQLException ex) {
            //Tratamento de erro.
            throw new RuntimeException("Erro ao salvar projeto", ex);
        } finally {
            //Fecha as conexões ao banco.
            ConnectionFactory.closeConnection(connection, statement);

        }

    }

    public void update(Project project) {

        String sql = "UPDATE projects SET name = ?, description = ?, createdAt = ?, updatedAt = ? WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conexão com o banco.
            connection = ConnectionFactory.getConnection();
            //Cria um PrepareStatement, classe usada para preparar a query.
            statement = connection.prepareStatement(sql);

            //Insere os dados para substituir os ? .
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            //Executa a query para inserção dos dados.
            statement.execute();

        } catch (SQLException ex) {
            //Tratamento de erro.
            throw new RuntimeException("Erro ao atualizar o projeto", ex);
        } finally {
            //Fecha as conexões ao banco.
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public List<Project> getAll() {

        String sql = "SELECT * FROM projects";

        List<Project> projects = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        //Classe que vai recuperar os dados do banco de dados.       
        ResultSet resultSet = null;

        try {

            //Cria uma conexão com o banco.
            connection = ConnectionFactory.getConnection();
            //Cria um PrepareStatement, classe usada para preparar a query.
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            //Enquanto existir dados no banco de dados, faça;
            while (resultSet.next()) {

                Project project = new Project();                               
                                                      
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o projeto na lista dos projetos.
                projects.add(project);

            }
        } catch (SQLException ex) {
            //Tratamento do erro.
            throw new RuntimeException("Erro ao buscar os projetos", ex);
        } finally {
            //Fecha as conexões ao banco.
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return projects;
    }

    public void removeById(int id) {

        String sql = "DELETE FROM projects WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            //Cria uma conexão com o banco.
            connection = ConnectionFactory.getConnection();
            //Cria um PrepareStatement, classe usada para preparar a query.
            statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException ex) {
            //Tratamento do erro.
            throw new RuntimeException("Erro ao deletar o projeto", ex);
        } finally {
            //Fecha as conexões ao banco.
            ConnectionFactory.closeConnection(connection, statement);
        }

    }

}
