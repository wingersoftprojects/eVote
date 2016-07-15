/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.County;
import entities.EVotingPersistentManager;
import entities.Parish;
import entities.Parish;
import entities.Sub_county;
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
public class ParishBean extends AbstractBean<Parish> implements Serializable {

    public ParishBean() {
        super(Parish.class);
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

    public List<Parish> getts(Sub_county sub_county) {
        List<Parish> temp = new ArrayList<>();
        try {
            if (this.getEntityClass() != null && sub_county != null) {
                temp = (List<Parish>) EVotingPersistentManager.instance().getSession().createQuery("select p FROM Parish  p where p.is_deleted<>1 AND p.sub_county=" + sub_county.getSub_county_id()).list();
            } else {
                temp = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
