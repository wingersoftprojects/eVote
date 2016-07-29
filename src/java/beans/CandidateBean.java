/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Candidate;
import entities.EVotingPersistentManager;
import entities.Parish;
import entities.Sub_county;
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

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class CandidateBean extends AbstractBean<Candidate> implements Serializable  {
    public CandidateBean() {
        super(Candidate.class);
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
    
    public List<Candidate> getts(Voter voter) {
        List<Candidate> temp = new ArrayList<>();
        try {
            if (this.getEntityClass() != null && voter != null) {
                temp = (List<Candidate>) EVotingPersistentManager.instance().getSession().createQuery("select c FROM Candidate  c where c.is_deleted<>1 AND c.voter=" + voter.getVoter_id()).list();
            } else {
                temp = new ArrayList<>();
            }
        } catch (PersistentException | HibernateException ex) {
            Logger.getLogger(AbstractBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }

}
