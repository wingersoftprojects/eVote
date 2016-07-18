/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: btwesigye
 * License Type: Purchased
 */
package entities;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="parish")
public class Parish implements Serializable {
	public Parish() {
	}
	
	public static Parish loadParishByORMID(int parish_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadParishByORMID(session, parish_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish getParishByORMID(int parish_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getParishByORMID(session, parish_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByORMID(int parish_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadParishByORMID(session, parish_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish getParishByORMID(int parish_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getParishByORMID(session, parish_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByORMID(PersistentSession session, int parish_id) throws PersistentException {
		try {
			return (Parish) session.load(entities.Parish.class, new Integer(parish_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish getParishByORMID(PersistentSession session, int parish_id) throws PersistentException {
		try {
			return (Parish) session.get(entities.Parish.class, new Integer(parish_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByORMID(PersistentSession session, int parish_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parish) session.load(entities.Parish.class, new Integer(parish_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish getParishByORMID(PersistentSession session, int parish_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parish) session.get(entities.Parish.class, new Integer(parish_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParish(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryParish(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParish(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryParish(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish[] listParishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listParishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish[] listParishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listParishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParish(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Parish as Parish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParish(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Parish as Parish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Parish", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish[] listParishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParish(session, condition, orderBy);
			return (Parish[]) list.toArray(new Parish[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish[] listParishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParish(session, condition, orderBy, lockMode);
			return (Parish[]) list.toArray(new Parish[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadParishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadParishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Parish[] parishs = listParishByQuery(session, condition, orderBy);
		if (parishs != null && parishs.length > 0)
			return parishs[0];
		else
			return null;
	}
	
	public static Parish loadParishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Parish[] parishs = listParishByQuery(session, condition, orderBy, lockMode);
		if (parishs != null && parishs.length > 0)
			return parishs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParishByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateParishByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParishByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateParishByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParishByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Parish as Parish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParishByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Parish as Parish");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Parish", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parish loadParishByCriteria(ParishCriteria parishCriteria) {
		Parish[] parishs = listParishByCriteria(parishCriteria);
		if(parishs == null || parishs.length == 0) {
			return null;
		}
		return parishs[0];
	}
	
	public static Parish[] listParishByCriteria(ParishCriteria parishCriteria) {
		return parishCriteria.listParish();
	}
	
	public static Parish createParish() {
		return new entities.Parish();
	}
	
	public boolean save() throws PersistentException {
		try {
			entities.EVotingPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			entities.EVotingPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			entities.EVotingPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			entities.EVotingPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getSubcounty() != null) {
				getSubcounty().getParish().remove(this);
			}
			
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setParish(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getSubcounty() != null) {
				getSubcounty().getParish().remove(this);
			}
			
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setParish(null);
			}
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="parish_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_PARISH_PARISH_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_PARISH_PARISH_ID_GENERATOR", strategy="native")	
	private int parish_id;
	
	@ManyToOne(targetEntity=entities.Sub_county.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="subcounty_id", referencedColumnName="sub_county_id", nullable=false) })	
	private entities.Sub_county subcounty;
	
	@Column(name="parish_name", nullable=false, length=100)	
	private String parish_name;
	
	@Column(name="is_deleted", nullable=true, length=1)	
	private Integer is_deleted;
	
	@Column(name="is_active", nullable=false, length=1)	
	private int is_active;
	
	@Column(name="add_date", nullable=true)	
	private java.sql.Timestamp add_date;
	
	@Column(name="add_by", nullable=true, length=11)	
	private Integer add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@Column(name="last_edit_by", nullable=true, length=11)	
	private Integer last_edit_by;
	
	@OneToMany(mappedBy="parish", targetEntity=entities.Voter.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set voter = new java.util.HashSet();
	
	private void setParish_id(int value) {
		this.parish_id = value;
	}
	
	public int getParish_id() {
		return parish_id;
	}
	
	public int getORMID() {
		return getParish_id();
	}
	
	public void setParish_name(String value) {
		this.parish_name = value;
	}
	
	public String getParish_name() {
		return parish_name;
	}
	
	public void setIs_deleted(int value) {
		setIs_deleted(new Integer(value));
	}
	
	public void setIs_deleted(Integer value) {
		this.is_deleted = value;
	}
	
	public Integer getIs_deleted() {
		return is_deleted;
	}
	
	public void setIs_active(int value) {
		this.is_active = value;
	}
	
	public int getIs_active() {
		return is_active;
	}
	
	public void setAdd_date(java.sql.Timestamp value) {
		this.add_date = value;
	}
	
	public java.sql.Timestamp getAdd_date() {
		return add_date;
	}
	
	public void setAdd_by(int value) {
		setAdd_by(new Integer(value));
	}
	
	public void setAdd_by(Integer value) {
		this.add_by = value;
	}
	
	public Integer getAdd_by() {
		return add_by;
	}
	
	public void setLast_edit_date(java.sql.Timestamp value) {
		this.last_edit_date = value;
	}
	
	public java.sql.Timestamp getLast_edit_date() {
		return last_edit_date;
	}
	
	public void setLast_edit_by(int value) {
		setLast_edit_by(new Integer(value));
	}
	
	public void setLast_edit_by(Integer value) {
		this.last_edit_by = value;
	}
	
	public Integer getLast_edit_by() {
		return last_edit_by;
	}
	
	public void setSubcounty(entities.Sub_county value) {
		this.subcounty = value;
	}
	
	public entities.Sub_county getSubcounty() {
		return subcounty;
	}
	
	public void setVoter(java.util.Set value) {
		this.voter = value;
	}
	
	public java.util.Set getVoter() {
		return voter;
	}
	
	
	public String toString() {
		return String.valueOf(getParish_id());
	}
	
}
