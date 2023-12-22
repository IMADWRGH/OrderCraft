package com.example.ordercraft.GestionArticles;

import java.sql.*;
import java.sql.ResultSet;
import java.util.*;
public class GestionClient {
    private Connection connection;

    private Statement statement;
    private String sql="";
    public GestionClient() throws Exception {
        connection=Cnx.getConnection();
        try {
            statement=connection.createStatement();
        }catch (SQLException msg){
            System.out.print("Erreur liee a la creation d'un Statement");
        }
    }
    public void Ajouter(Article article){
        sql="insert into article values('"+article.getDesignation()+"','"+article.getPrix_uni()+"','"+article.getQte_stock()+")";
        try {
            statement.executeUpdate(sql);
        }catch (SQLException msg){
            System.out.print("Error at query....");
        }
    }
    public void Modifier(Article article){
        sql=" UPDATE  article  SET  designation ='"+article.getDesignation()+"', prix_unitaire='"+article.getPrix_uni()+"', qte_stock='"+article.getQte_stock()+"' WHERE code_article='"+article.getCode_article()+"')";
        try {
            statement.executeUpdate(sql);
        }catch (SQLException msg){
            System.out.print("Error at query....");
        }
    }
    public void Supprimer(int code ){
        sql=" DELETE FROM article WHERE code_article= '"+code+"'";
        try {
            statement.executeUpdate(sql);
        }catch (SQLException msg){
            System.out.print("Error at query....");
        }
    }
    public List<Article> Lister(){
        sql="SELECT * FROM article";
        ResultSet resultSet;
        try {
            List<Article> List_art = new ArrayList<Article>();
            resultSet=statement.executeQuery(sql);
            System.out.println("La liste des Articles :");
            while (resultSet.next()) {
                List_art.add(new Article(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble("prix unitaire"), resultSet.getInt(4)));
                System.out.println(resultSet.getString("code_article")+"  "+resultSet.getString("designation")
                        +" "+resultSet.getString("prix_unitaire")+"  "+resultSet.getString("qte_stock"));
                System.out.println("-------------------------");
            }
            return List_art;
        }catch (Exception msg){
            System.out.print("Error at query....");
        }
        return null;
    }
    public Article Rechercher_article(int code ){
        sql="SELECT * FROM `article` WHERE code_article= " +code+" ";
        try {
            ResultSet resultSet =statement.executeQuery(sql);
            System.out.println("Les informations sur la article :");
            while (resultSet.next()) {
                return new Article(resultSet.getInt(1),resultSet.getString("designation"),resultSet.getDouble("prix_unitaire"),resultSet.getInt("qte_stock"));
            }
        }catch (Exception msg){
            System.out.print("Error at query.....");
        }
        return null;
    }
}