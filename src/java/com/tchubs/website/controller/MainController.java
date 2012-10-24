/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tchubs.website.controller;

import com.google.gson.Gson;
import com.tchubs.website.dao.ContentDAO;
import com.tchubs.website.dao.DataAccessException;
import com.tchubs.website.model.Article;

/**
 *
 * @author tchubs
 */
public class MainController {
    
    private ContentDAO contentDAO;

    public String convertToJSON(Object o) {
        String json;

                
        Gson gson = new Gson();
        json = gson.toJson(o);
        return json;
    }

    /**
     * @param contentDAO the contentDAO to set
     */
    public void setContentDAO(ContentDAO contentDAO) {
        this.contentDAO = contentDAO;
    }
    
    public Article[] getArticles() throws DataAccessException{
        return contentDAO.loadContent();
    }
    
    public void saveArticle( Article article ) throws DataAccessException{
        contentDAO.saveArticle(article);
    }
}
