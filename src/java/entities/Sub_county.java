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
@Table(name="sub_county")
public class Sub_county implements Serializable {
	public Sub_county() {
	}
	
	public static Sub_county loadSub_countyByORMID(int sub_county_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadSub_countyByORMID(session, sub_county_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county getSub_countyByORMID(int sub_county_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getSub_countyByORMID(session, sub_county_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByORMID(int sub_county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadSub_countyByORMID(session, sub_county_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county getSub_countyByORMID(int sub_county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getSub_countyByORMID(session, sub_county_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByORMID(PersistentSession session, int sub_county_id) throws PersistentException {
		try {
			return (Sub_county) session.load(entities.Sub_county.class, new Integer(sub_county_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county getSub_countyByORMID(PersistentSession session, int sub_county_id) throws PersistentException {
		try {
			return (Sub_county) session.get(entities.Sub_county.class, new Integer(sub_county_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByORMID(PersistentSession session, int sub_county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sub_county) session.load(entities.Sub_county.class, new Integer(sub_county_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county getSub_countyByORMID(PersistentSession session, int sub_county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sub_county) session.get(entities.Sub_county.class, new Integer(sub_county_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySub_county(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return querySub_county(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySub_county(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return querySub_county(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county[] listSub_countyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listSub_countyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county[] listSub_countyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listSub_countyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySub_county(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Sub_county as Sub_county");
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
	
	public static List querySub_county(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Sub_county as Sub_county");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sub_county", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county[] listSub_countyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySub_county(session, condition, orderBy);
			return (Sub_county[]) list.toArray(new Sub_county[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county[] listSub_countyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySub_county(session, condition, orderBy, lockMode);
			return (Sub_county[]) list.toArray(new Sub_county[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadSub_countyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadSub_countyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sub_county[] sub_countys = listSub_countyByQuery(session, condition, orderBy);
		if (sub_countys != null && sub_countys.length > 0)
			return sub_countys[0];
		else
			return null;
	}
	
	public static Sub_county loadSub_countyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sub_county[] sub_countys = listSub_countyByQuery(session, condition, orderBy, lockMode);
		if (sub_countys != null && sub_countys.length > 0)
			return sub_countys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSub_countyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateSub_countyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSub_countyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateSub_countyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSub_countyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Sub_county as Sub_county");
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
	
	public static java.util.Iterator iterateSub_countyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Sub_county as Sub_county");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sub_county", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sub_county loadSub_countyByCriteria(Sub_countyCriteria sub_countyCriteria) {
		Sub_county[] sub_countys = listSub_countyByCriteria(sub_countyCriteria);
		if(sub_countys == null || sub_countys.length == 0) {
			return null;
		}
		return sub_countys[0];
	}
	
	public static Sub_county[] listSub_countyByCriteria(Sub_countyCriteria sub_countyCriteria) {
		return sub_countyCriteria.listSub_county();
	}
	
	public static Sub_county createSub_county() {
		return new entities.Sub_county();
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
			if(getCounty() != null) {
				getCounty().getSub_county().remove(this);
			}
			
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setSub_county(null);
			}
			entities.Parish[] lParishs = (entities.Parish[])getParish().toArray(new entities.Parish[getParish().size()]);
			for(int i = 0; i < lParishs.length; i++) {
				lParishs[i].setSub_county(null);
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
			if(getCounty() != null) {
				getCounty().getSub_county().remove(this);
			}
			
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setSub_county(null);
			}
			entities.Parish[] lParishs = (entities.Parish[])getParish().toArray(new entities.Parish[getParish().size()]);
			for(int i = 0; i < lParishs.length; i++) {
				lParishs[i].setSub_county(null);
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
	
	@Column(name="sub_county_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_SUB_COUNTY_SUB_COUNTY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_SUB_COUNTY_SUB_COUNTY_ID_GENERATOR", strategy="native")	
	private int sub_county_id;
	
	@ManyToOne(targetEntity=entities.County.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="county_id", referencedColumnName="county_id", nullable=false) })	
	private entities.County county;
	
	@Column(name="sub_county_name", nullable=false, length=100)	
	private String sub_county_name;
	
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
	
	@OneToMany(mappedBy="sub_county", targetEntity=entities.Voter.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set voter = new java.util.HashSet();
	
	@OneToMany(mappedBy="sub_county", targetEntity=entities.Parish.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set parish = new java.util.HashSet();
	
	private void setSub_county_id(int value) {
		this.sub_county_id = value;
	}
	
	public int getSub_county_id() {
		return sub_county_id;
	}
	
	public int getORMID() {
		return getSub_county_id();
	}
	
	public void setSub_county_name(String value) {
		this.sub_county_name = value;
	}
	
	public String getSub_county_name() {
		return sub_county_name;
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
	
	public void setCounty(entities.County value) {
		this.county = value;
	}
	
	public entities.County getCounty() {
		return county;
	}
	
	public void setVoter(java.util.Set value) {
		this.voter = value;
	}
	
	public java.util.Set getVoter() {
		return voter;
	}
	
	
	public void setParish(java.util.Set value) {
		this.parish = value;
	}
	
	public java.util.Set getParish() {
		return parish;
	}
	
	
	public String toString() {
		return String.valueOf(getSub_county_id());
	}
	
}
