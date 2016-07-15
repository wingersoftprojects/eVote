/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bajuna
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
@Table(name="`group right`")
public class Group_right implements Serializable {
	public Group_right() {
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getGroup_rightByORMID(session, group_right_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.load(entities.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id) throws PersistentException {
		try {
			return (Group_right) session.get(entities.Group_right.class, new Integer(group_right_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.load(entities.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right getGroup_rightByORMID(PersistentSession session, int group_right_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Group_right) session.get(entities.Group_right.class, new Integer(group_right_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryGroup_right(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Group_right as Group_right");
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
	
	public static List queryGroup_right(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right[] listGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGroup_right(session, condition, orderBy, lockMode);
			return (Group_right[]) list.toArray(new Group_right[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static Group_right loadGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Group_right[] group_rights = listGroup_rightByQuery(session, condition, orderBy, lockMode);
		if (group_rights != null && group_rights.length > 0)
			return group_rights[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateGroup_rightByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Group_right as Group_right");
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
	
	public static java.util.Iterator iterateGroup_rightByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Group_right as Group_right");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Group_right", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Group_right loadGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		Group_right[] group_rights = listGroup_rightByCriteria(group_rightCriteria);
		if(group_rights == null || group_rights.length == 0) {
			return null;
		}
		return group_rights[0];
	}
	
	public static Group_right[] listGroup_rightByCriteria(Group_rightCriteria group_rightCriteria) {
		return group_rightCriteria.listGroup_right();
	}
	
	public static Group_right createGroup_right() {
		return new entities.Group_right();
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_rights().remove(this);
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
			if(getGroup_detail() != null) {
				getGroup_detail().getGroup_rights().remove(this);
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
	
	@Column(name="group_rights_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_GROUP_RIGHT_GROUP_RIGHT_ID_GENERATOR", strategy="native")	
	private int group_right_id;
	
	@ManyToOne(targetEntity=entities.Group_detail.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="group_id", referencedColumnName="group_detail_id", nullable=false) })	
	private entities.Group_detail group_detail;
	
	@Column(name="function_name", nullable=false, length=100)	
	private String function_name;
	
	@Column(name="allow_view", nullable=true, length=1)	
	private Integer allow_view;
	
	@Column(name="allow_add", nullable=true, length=1)	
	private Integer allow_add;
	
	@Column(name="allow_edit", nullable=true, length=1)	
	private Integer allow_edit;
	
	@Column(name="allow_delete", nullable=true, length=1)	
	private Integer allow_delete;
	
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
	
	private void setGroup_right_id(int value) {
		this.group_right_id = value;
	}
	
	public int getGroup_right_id() {
		return group_right_id;
	}
	
	public int getORMID() {
		return getGroup_right_id();
	}
	
	/**
	 * USER
	 * VOTER
	 * CANDIDATE
	 * LOCATION
	 * RESULT
	 */
	public void setFunction_name(String value) {
		this.function_name = value;
	}
	
	/**
	 * USER
	 * VOTER
	 * CANDIDATE
	 * LOCATION
	 * RESULT
	 */
	public String getFunction_name() {
		return function_name;
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
	
	public void setAllow_view(int value) {
		setAllow_view(new Integer(value));
	}
	
	public void setAllow_view(Integer value) {
		this.allow_view = value;
	}
	
	public Integer getAllow_view() {
		return allow_view;
	}
	
	public void setAllow_add(int value) {
		setAllow_add(new Integer(value));
	}
	
	public void setAllow_add(Integer value) {
		this.allow_add = value;
	}
	
	public Integer getAllow_add() {
		return allow_add;
	}
	
	public void setAllow_edit(int value) {
		setAllow_edit(new Integer(value));
	}
	
	public void setAllow_edit(Integer value) {
		this.allow_edit = value;
	}
	
	public Integer getAllow_edit() {
		return allow_edit;
	}
	
	public void setAllow_delete(int value) {
		setAllow_delete(new Integer(value));
	}
	
	public void setAllow_delete(Integer value) {
		this.allow_delete = value;
	}
	
	public Integer getAllow_delete() {
		return allow_delete;
	}
	
	public void setGroup_detail(entities.Group_detail value) {
		this.group_detail = value;
	}
	
	public entities.Group_detail getGroup_detail() {
		return group_detail;
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
		      Group_right object = (Group_right) obj;
		        return (this.getGroup_right_id() == object.getGroup_right_id());
	}
	
	public String toString() {
		return String.valueOf(getGroup_right_id());
	}
	
}
