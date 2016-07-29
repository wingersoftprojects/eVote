/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.EVotingPersistentManager;
import entities.Post;
import entities.Voter;
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
import org.primefaces.model.UploadedFile;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class VoterBean extends AbstractBean<Voter> implements Serializable  {
    private UploadedFile file;
    public VoterBean() {
        super(Voter.class);
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

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }
    public List<Voter> getts() {
        List<Voter> temp = new ArrayList<>();
        try {
            if (this.getEntityClass() != null) {
                temp = (List<Voter>) EVotingPersistentManager.instance().getSession().createQuery("select c FROM Voter  c where c.is_deleted<>1").list();
            } else {
                temp = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
}
