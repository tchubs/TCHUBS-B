/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tchubs.website.dao;

import com.tchubs.website.model.Article;

/**
 *
 * @author tchubs
 */
public interface ContentDAO {
    void initialize() throws DataAccessException;
    Article[] loadContent() throws DataAccessException;
    void saveArticle( Article article ) throws DataAccessException;
    void destroy();
}
