/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Menu;

/**
 *
 * @author Mario
 */
public interface MenuDao {
    //public List<Menu> findByResp(Integer idResp);
    public List<Menu> findByRolMenu (Integer idMenu);
}
