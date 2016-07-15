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
@Table(name="county")
public class County implements Serializable {
	public County() {
	}
	
	public static County loadCountyByORMID(int county_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountyByORMID(session, county_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County getCountyByORMID(int county_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getCountyByORMID(session, county_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByORMID(int county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountyByORMID(session, county_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County getCountyByORMID(int county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getCountyByORMID(session, county_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByORMID(PersistentSession session, int county_id) throws PersistentException {
		try {
			return (County) session.load(entities.County.class, new Integer(county_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County getCountyByORMID(PersistentSession session, int county_id) throws PersistentException {
		try {
			return (County) session.get(entities.County.class, new Integer(county_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByORMID(PersistentSession session, int county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (County) session.load(entities.County.class, new Integer(county_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County getCountyByORMID(PersistentSession session, int county_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (County) session.get(entities.County.class, new Integer(county_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCounty(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryCounty(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCounty(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryCounty(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County[] listCountyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listCountyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County[] listCountyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listCountyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCounty(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.County as County");
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
	
	public static List queryCounty(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.County as County");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("County", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County[] listCountyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCounty(session, condition, orderBy);
			return (County[]) list.toArray(new County[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County[] listCountyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCounty(session, condition, orderBy, lockMode);
			return (County[]) list.toArray(new County[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		County[] countys = listCountyByQuery(session, condition, orderBy);
		if (countys != null && countys.length > 0)
			return countys[0];
		else
			return null;
	}
	
	public static County loadCountyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		County[] countys = listCountyByQuery(session, condition, orderBy, lockMode);
		if (countys != null && countys.length > 0)
			return countys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCountyByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateCountyByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCountyByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateCountyByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCountyByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.County as County");
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
	
	public static java.util.Iterator iterateCountyByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.County as County");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("County", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static County loadCountyByCriteria(CountyCriteria countyCriteria) {
		County[] countys = listCountyByCriteria(countyCriteria);
		if(countys == null || countys.length == 0) {
			return null;
		}
		return countys[0];
	}
	
	public static County[] listCountyByCriteria(CountyCriteria countyCriteria) {
		return countyCriteria.listCounty();
	}
	
	public static County createCounty() {
		return new entities.County();
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
			if(getDistrict() != null) {
				getDistrict().getCounty().remove(this);
			}
			
			entities.Sub_county[] lSub_countys = (entities.Sub_county[])getSub_county().toArray(new entities.Sub_county[getSub_county().size()]);
			for(int i = 0; i < lSub_countys.length; i++) {
				lSub_countys[i].setCounty(null);
			}
			entities.Post[] lPosts = (entities.Post[])getPost().toArray(new entities.Post[getPost().size()]);
			for(int i = 0; i < lPosts.length; i++) {
				lPosts[i].setCounty(null);
			}
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setCounty(null);
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
			if(getDistrict() != null) {
				getDistrict().getCounty().remove(this);
			}
			
			entities.Sub_county[] lSub_countys = (entities.Sub_county[])getSub_county().toArray(new entities.Sub_county[getSub_county().size()]);
			for(int i = 0; i < lSub_countys.length; i++) {
				lSub_countys[i].setCounty(null);
			}
			entities.Post[] lPosts = (entities.Post[])getPost().toArray(new entities.Post[getPost().size()]);
			for(int i = 0; i < lPosts.length; i++) {
				lPosts[i].setCounty(null);
			}
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setCounty(null);
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
	
	@Column(name="county_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_COUNTY_COUNTY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_COUNTY_COUNTY_ID_GENERATOR", strategy="native")	
	private int county_id;
	
	@ManyToOne(targetEntity=entities.District.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="district_id", referencedColumnName="district_id", nullable=false) })	
	private entities.District district;
	
	@Column(name="county_name", nullable=false, length=100)	
	private String county_name;
	
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
	
	@OneToMany(mappedBy="county", targetEntity=entities.Sub_county.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set sub_county = new java.util.HashSet();
	
	@OneToMany(mappedBy="county", targetEntity=entities.Post.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set post = new java.util.HashSet();
	
	@OneToMany(mappedBy="county", targetEntity=entities.Voter.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set voter = new java.util.HashSet();
	
	private void setCounty_id(int value) {
		this.county_id = value;
	}
	
	public int getCounty_id() {
		return county_id;
	}
	
	public int getORMID() {
		return getCounty_id();
	}
	
	public void setCounty_name(String value) {
		this.county_name = value;
	}
	
	public String getCounty_name() {
		return county_name;
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
	
	public void setDistrict(entities.District value) {
		this.district = value;
	}
	
	public entities.District getDistrict() {
		return district;
	}
	
	public void setSub_county(java.util.Set value) {
		this.sub_county = value;
	}
	
	public java.util.Set getSub_county() {
		return sub_county;
	}
	
	
	public void setPost(java.util.Set value) {
		this.post = value;
	}
	
	public java.util.Set getPost() {
		return post;
	}
	
	
	public void setVoter(java.util.Set value) {
		this.voter = value;
	}
	
	public java.util.Set getVoter() {
		return voter;
	}
	
	
	@Override	
	public int hashCode() {
		int hash = 3;
		        return hash;
	}
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null) {
		            return false;
		        }
		      County object = (County) obj;
		        return (this.getCounty_id() == object.getCounty_id());
	}
	
	public String toString() {
		return String.valueOf(getCounty_id());
	}
	
}
