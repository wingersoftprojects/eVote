/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.EVotingPersistentManager;
import entities.Parish;
import entities.Sub_county;
import entities.Village;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.hibernate.HibernateException;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class VillageBean extends AbstractBean<Village> implements Serializable  {
    public VillageBean() {
        super(Village.class);
    }
    @Override
    public void init() {
        if (super.getEntityClass() == null) {
            loginBean.logout();
        }
    }
    @ManagedProperty("#{loginBean}")
    private LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    
    private Parish parish;

    /**
     * @return the parish
     */
    public Parish getParish() {
        return parish;
    }

    /**
     * @param parish the parish to set
     */
    public void setParish(Parish parish) {
        this.parish = parish;
    }
    
    public List<Village> getts(Parish parish) {
        List<Village> temp = new ArrayList<>();
        try {
            if (this.getEntityClass() != null && parish != null) {
                temp = (List<Village>) EVotingPersistentManager.instance().getSession().createQuery("select v FROM Village  v where v.is_deleted<>1 AND v.parish=" + parish.getParish_id()).list();
            } else {
                temp = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
