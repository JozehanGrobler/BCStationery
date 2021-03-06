/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayerPackage;
//T

import DataAccessLayerPackage.catagoryHandler;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jozehan
 */
public class Category implements Serializable {

    private final int CategoryID;
    private String name;

    public Category(int CategoryID, String name) {
        this.CategoryID = CategoryID;
        this.name = name;
    }

    public Category(int CategoryID) {
        this.CategoryID = CategoryID;
        //look for category with ID and add data
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public Category() {
        this.CategoryID = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
