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
@Table(name="finger_print")
public class Finger_print implements Serializable {
	public Finger_print() {
	}
	
	public static Finger_print loadFinger_printByORMID(int finger_print_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadFinger_printByORMID(session, finger_print_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print getFinger_printByORMID(int finger_print_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getFinger_printByORMID(session, finger_print_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByORMID(int finger_print_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadFinger_printByORMID(session, finger_print_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print getFinger_printByORMID(int finger_print_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getFinger_printByORMID(session, finger_print_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByORMID(PersistentSession session, int finger_print_id) throws PersistentException {
		try {
			return (Finger_print) session.load(entities.Finger_print.class, new Integer(finger_print_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print getFinger_printByORMID(PersistentSession session, int finger_print_id) throws PersistentException {
		try {
			return (Finger_print) session.get(entities.Finger_print.class, new Integer(finger_print_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByORMID(PersistentSession session, int finger_print_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Finger_print) session.load(entities.Finger_print.class, new Integer(finger_print_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print getFinger_printByORMID(PersistentSession session, int finger_print_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Finger_print) session.get(entities.Finger_print.class, new Integer(finger_print_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFinger_print(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryFinger_print(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFinger_print(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryFinger_print(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print[] listFinger_printByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listFinger_printByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print[] listFinger_printByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listFinger_printByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFinger_print(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Finger_print as Finger_print");
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
	
	public static List queryFinger_print(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Finger_print as Finger_print");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Finger_print", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print[] listFinger_printByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFinger_print(session, condition, orderBy);
			return (Finger_print[]) list.toArray(new Finger_print[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print[] listFinger_printByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFinger_print(session, condition, orderBy, lockMode);
			return (Finger_print[]) list.toArray(new Finger_print[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadFinger_printByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadFinger_printByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Finger_print[] finger_prints = listFinger_printByQuery(session, condition, orderBy);
		if (finger_prints != null && finger_prints.length > 0)
			return finger_prints[0];
		else
			return null;
	}
	
	public static Finger_print loadFinger_printByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Finger_print[] finger_prints = listFinger_printByQuery(session, condition, orderBy, lockMode);
		if (finger_prints != null && finger_prints.length > 0)
			return finger_prints[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFinger_printByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateFinger_printByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFinger_printByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateFinger_printByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFinger_printByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Finger_print as Finger_print");
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
	
	public static java.util.Iterator iterateFinger_printByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Finger_print as Finger_print");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Finger_print", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Finger_print loadFinger_printByCriteria(Finger_printCriteria finger_printCriteria) {
		Finger_print[] finger_prints = listFinger_printByCriteria(finger_printCriteria);
		if(finger_prints == null || finger_prints.length == 0) {
			return null;
		}
		return finger_prints[0];
	}
	
	public static Finger_print[] listFinger_printByCriteria(Finger_printCriteria finger_printCriteria) {
		return finger_printCriteria.listFinger_print();
	}
	
	public static Finger_print createFinger_print() {
		return new entities.Finger_print();
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
			if(getVoter() != null) {
				getVoter().getFinger_print().remove(this);
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
			if(getVoter() != null) {
				getVoter().getFinger_print().remove(this);
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
	
	@Column(name="finger_print_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_FINGER_PRINT_FINGER_PRINT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_FINGER_PRINT_FINGER_PRINT_ID_GENERATOR", strategy="native")	
	private int finger_print_id;
	
	@Column(name="fingerprint_name", nullable=true, length=50)	
	private String fingerprint_name;
	
	@ManyToOne(targetEntity=entities.Voter.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="voter_id", referencedColumnName="voter_id", nullable=false) })	
	private entities.Voter voter;
	
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
	
	private void setFinger_print_id(int value) {
		this.finger_print_id = value;
	}
	
	public int getFinger_print_id() {
		return finger_print_id;
	}
	
	public int getORMID() {
		return getFinger_print_id();
	}
	
	public void setFingerprint_name(String value) {
		this.fingerprint_name = value;
	}
	
	public String getFingerprint_name() {
		return fingerprint_name;
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
	
	public void setVoter(entities.Voter value) {
		this.voter = value;
	}
	
	public entities.Voter getVoter() {
		return voter;
	}
	
	public String toString() {
		return String.valueOf(getFinger_print_id());
	}
	
}
