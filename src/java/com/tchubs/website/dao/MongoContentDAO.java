/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tchubs.website.dao;

import com.google.gson.Gson;
import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;
import com.mongodb.util.JSON;

import com.tchubs.website.model.Article;
import java.net.UnknownHostException;

/**
 *
 * @author tchubs
 */
public class MongoContentDAO implements ContentDAO {

    Mongo mongo;
    DB tchubsDB;

    @Override
    public void initialize() throws DataAccessException{
        try {
            mongo = new Mongo();  
            mongo.setWriteConcern(WriteConcern.SAFE);
            
            tchubsDB = mongo.getDB("tchubs");
        }
        catch(UnknownHostException uhe ){
            throw new DataAccessException( uhe );
        }
    }

    @Override
    public Article[] loadContent() throws DataAccessException{
        
        Article[] articles = new Article[1];
        
        DBCollection articleCollection = tchubsDB.getCollection("articles");
        DBObject articleDoc = articleCollection.findOne();
        
        Gson gson = new Gson();
        articles[0] = gson.fromJson( articleDoc.toString(), Article.class );
        
        return articles;
    }

    @Override
    public void saveArticle( Article article ) throws DataAccessException {
        
        Gson gson = new Gson();
        String json = gson.toJson( article );
        
        DBObject articleDoc = (DBObject) JSON.parse(json);

        DBCollection articleCollection = tchubsDB.getCollection("articles");
        articleCollection.insert( articleDoc );
    }

    @Override
    public void destroy(){
        mongo.close();
    }
}
