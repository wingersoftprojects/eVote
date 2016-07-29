/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.County;
import entities.EVotingPersistentManager;
import entities.Polling_station;
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
public class Polling_stationBean extends AbstractBean<Polling_station> implements Serializable {

    public Polling_stationBean() {
        super(Polling_station.class);
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
    
    public List<Polling_station> getts(Village village) {
        List<Polling_station> temp = new ArrayList<>();
        try {
            if (this.getEntityClass() != null && village != null) {
                temp = (List<Polling_station>) EVotingPersistentManager.instance().getSession().createQuery("select ps FROM Polling_station  ps where ps.is_deleted<>1 AND ps.village=" + village.getVillage_id()).list();
            } else {
                temp = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
