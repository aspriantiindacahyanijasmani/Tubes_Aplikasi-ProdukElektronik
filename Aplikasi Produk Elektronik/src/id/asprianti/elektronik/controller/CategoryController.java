/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.asprianti.elektronik.controller;

import id.asprianti.eletronik.dao.CategoryDAO;
import id.asprianti.eletronik.dao.CategoryDAOMySQL;
import id.asprianti.elektronik.model.Category;
import java.util.List;

/**
 *
 * @author Asus
 */
public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
