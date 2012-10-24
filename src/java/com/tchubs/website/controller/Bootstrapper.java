/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tchubs.website.controller;

import com.tchubs.website.dao.DataAccessException;
import com.tchubs.website.dao.MockContentDAO;
import com.tchubs.website.dao.MongoContentDAO;

/**
 *
 * @author tchubs
 */
public class Bootstrapper {

    MainController mainController;
    MockContentDAO mockContentDAO;
    MongoContentDAO mongoContentDAO;

    public MainController initialize() throws DataAccessException {
        mainController = new MainController();
        mockContentDAO = new MockContentDAO();
        mongoContentDAO = new MongoContentDAO();
        mongoContentDAO.initialize();
        mainController.setContentDAO(mongoContentDAO);
        return mainController;
    }

    public void destroy(){
        mongoContentDAO.destroy();
        mainController = null;
    }
}
