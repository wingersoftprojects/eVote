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
@Table(name="country")
public class Country implements Serializable {
	public Country() {
	}
	
	public static Country loadCountryByORMID(int country_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountryByORMID(session, country_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country getCountryByORMID(int country_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getCountryByORMID(session, country_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByORMID(int country_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountryByORMID(session, country_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country getCountryByORMID(int country_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getCountryByORMID(session, country_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByORMID(PersistentSession session, int country_id) throws PersistentException {
		try {
			return (Country) session.load(entities.Country.class, new Integer(country_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country getCountryByORMID(PersistentSession session, int country_id) throws PersistentException {
		try {
			return (Country) session.get(entities.Country.class, new Integer(country_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByORMID(PersistentSession session, int country_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Country) session.load(entities.Country.class, new Integer(country_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country getCountryByORMID(PersistentSession session, int country_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Country) session.get(entities.Country.class, new Integer(country_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCountry(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryCountry(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCountry(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryCountry(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country[] listCountryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listCountryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country[] listCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listCountryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCountry(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Country as Country");
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
	
	public static List queryCountry(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Country as Country");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Country", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCountry(session, condition, orderBy);
			return (Country[]) list.toArray(new Country[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country[] listCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCountry(session, condition, orderBy, lockMode);
			return (Country[]) list.toArray(new Country[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadCountryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Country[] countrys = listCountryByQuery(session, condition, orderBy);
		if (countrys != null && countrys.length > 0)
			return countrys[0];
		else
			return null;
	}
	
	public static Country loadCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Country[] countrys = listCountryByQuery(session, condition, orderBy, lockMode);
		if (countrys != null && countrys.length > 0)
			return countrys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCountryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateCountryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCountryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateCountryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Country as Country");
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
	
	public static java.util.Iterator iterateCountryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Country as Country");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Country", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Country loadCountryByCriteria(CountryCriteria countryCriteria) {
		Country[] countrys = listCountryByCriteria(countryCriteria);
		if(countrys == null || countrys.length == 0) {
			return null;
		}
		return countrys[0];
	}
	
	public static Country[] listCountryByCriteria(CountryCriteria countryCriteria) {
		return countryCriteria.listCountry();
	}
	
	public static Country createCountry() {
		return new entities.Country();
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
			entities.District[] lDistricts = (entities.District[])getDistrict().toArray(new entities.District[getDistrict().size()]);
			for(int i = 0; i < lDistricts.length; i++) {
				lDistricts[i].setCountry(null);
			}
			entities.Post[] lPosts = (entities.Post[])getPost().toArray(new entities.Post[getPost().size()]);
			for(int i = 0; i < lPosts.length; i++) {
				lPosts[i].setCountry(null);
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
			entities.District[] lDistricts = (entities.District[])getDistrict().toArray(new entities.District[getDistrict().size()]);
			for(int i = 0; i < lDistricts.length; i++) {
				lDistricts[i].setCountry(null);
			}
			entities.Post[] lPosts = (entities.Post[])getPost().toArray(new entities.Post[getPost().size()]);
			for(int i = 0; i < lPosts.length; i++) {
				lPosts[i].setCountry(null);
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
	
	@Column(name="country_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_COUNTRY_COUNTRY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_COUNTRY_COUNTRY_ID_GENERATOR", strategy="native")	
	private int country_id;
	
	@Column(name="country_name", nullable=false, length=100)	
	private String country_name;
	
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
	
	@OneToMany(mappedBy="country", targetEntity=entities.District.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set district = new java.util.HashSet();
	
	@OneToMany(mappedBy="country", targetEntity=entities.Post.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set post = new java.util.HashSet();
	
	private void setCountry_id(int value) {
		this.country_id = value;
	}
	
	public int getCountry_id() {
		return country_id;
	}
	
	public int getORMID() {
		return getCountry_id();
	}
	
	public void setCountry_name(String value) {
		this.country_name = value;
	}
	
	public String getCountry_name() {
		return country_name;
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
	
	public void setDistrict(java.util.Set value) {
		this.district = value;
	}
	
	public java.util.Set getDistrict() {
		return district;
	}
	
	
	public void setPost(java.util.Set value) {
		this.post = value;
	}
	
	public java.util.Set getPost() {
		return post;
	}
	
	
	public String toString() {
		return String.valueOf(getCountry_id());
	}
	
}
