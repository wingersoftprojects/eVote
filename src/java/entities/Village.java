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
@Table(name="village")
public class Village implements Serializable {
	public Village() {
	}
	
	public static Village loadVillageByORMID(int village_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVillageByORMID(session, village_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village getVillageByORMID(int village_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getVillageByORMID(session, village_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByORMID(int village_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVillageByORMID(session, village_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village getVillageByORMID(int village_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getVillageByORMID(session, village_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByORMID(PersistentSession session, int village_id) throws PersistentException {
		try {
			return (Village) session.load(entities.Village.class, new Integer(village_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village getVillageByORMID(PersistentSession session, int village_id) throws PersistentException {
		try {
			return (Village) session.get(entities.Village.class, new Integer(village_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByORMID(PersistentSession session, int village_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Village) session.load(entities.Village.class, new Integer(village_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village getVillageByORMID(PersistentSession session, int village_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Village) session.get(entities.Village.class, new Integer(village_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVillage(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryVillage(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVillage(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryVillage(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village[] listVillageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listVillageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village[] listVillageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listVillageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVillage(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Village as Village");
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
	
	public static List queryVillage(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Village as Village");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Village", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village[] listVillageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVillage(session, condition, orderBy);
			return (Village[]) list.toArray(new Village[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village[] listVillageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVillage(session, condition, orderBy, lockMode);
			return (Village[]) list.toArray(new Village[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVillageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVillageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Village[] villages = listVillageByQuery(session, condition, orderBy);
		if (villages != null && villages.length > 0)
			return villages[0];
		else
			return null;
	}
	
	public static Village loadVillageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Village[] villages = listVillageByQuery(session, condition, orderBy, lockMode);
		if (villages != null && villages.length > 0)
			return villages[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVillageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateVillageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVillageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateVillageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVillageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Village as Village");
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
	
	public static java.util.Iterator iterateVillageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Village as Village");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Village", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Village loadVillageByCriteria(VillageCriteria villageCriteria) {
		Village[] villages = listVillageByCriteria(villageCriteria);
		if(villages == null || villages.length == 0) {
			return null;
		}
		return villages[0];
	}
	
	public static Village[] listVillageByCriteria(VillageCriteria villageCriteria) {
		return villageCriteria.listVillage();
	}
	
	public static Village createVillage() {
		return new entities.Village();
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
			entities.Polling_station[] lPolling_stations = (entities.Polling_station[])getPolling_station().toArray(new entities.Polling_station[getPolling_station().size()]);
			for(int i = 0; i < lPolling_stations.length; i++) {
				lPolling_stations[i].setVillage(null);
			}
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setVillage(null);
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
			entities.Polling_station[] lPolling_stations = (entities.Polling_station[])getPolling_station().toArray(new entities.Polling_station[getPolling_station().size()]);
			for(int i = 0; i < lPolling_stations.length; i++) {
				lPolling_stations[i].setVillage(null);
			}
			entities.Voter[] lVoters = (entities.Voter[])getVoter().toArray(new entities.Voter[getVoter().size()]);
			for(int i = 0; i < lVoters.length; i++) {
				lVoters[i].setVillage(null);
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
	
	@Column(name="village_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_VILLAGE_VILLAGE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_VILLAGE_VILLAGE_ID_GENERATOR", strategy="native")	
	private int village_id;
	
	@Column(name="village_name", nullable=false, length=100)	
	private String village_name;
	
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
	
	@OneToMany(mappedBy="village", targetEntity=entities.Polling_station.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set polling_station = new java.util.HashSet();
	
	@OneToMany(mappedBy="village", targetEntity=entities.Voter.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set voter = new java.util.HashSet();
	
	private void setVillage_id(int value) {
		this.village_id = value;
	}
	
	public int getVillage_id() {
		return village_id;
	}
	
	public int getORMID() {
		return getVillage_id();
	}
	
	public void setVillage_name(String value) {
		this.village_name = value;
	}
	
	public String getVillage_name() {
		return village_name;
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
	
	public void setPolling_station(java.util.Set value) {
		this.polling_station = value;
	}
	
	public java.util.Set getPolling_station() {
		return polling_station;
	}
	
	
	public void setVoter(java.util.Set value) {
		this.voter = value;
	}
	
	public java.util.Set getVoter() {
		return voter;
	}
	
	
	public String toString() {
		return String.valueOf(getVillage_id());
	}
	
}
