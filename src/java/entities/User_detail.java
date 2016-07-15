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
@Table(name="user_detail")
public class User_detail implements Serializable {
	public User_detail() {
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getUser_detailByORMID(session, user_detail_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.load(entities.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id) throws PersistentException {
		try {
			return (User_detail) session.get(entities.User_detail.class, new Integer(user_detail_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.load(entities.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail getUser_detailByORMID(PersistentSession session, int user_detail_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User_detail) session.get(entities.User_detail.class, new Integer(user_detail_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryUser_detail(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.User_detail as User_detail");
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
	
	public static List queryUser_detail(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail[] listUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser_detail(session, condition, orderBy, lockMode);
			return (User_detail[]) list.toArray(new User_detail[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static User_detail loadUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User_detail[] user_details = listUser_detailByQuery(session, condition, orderBy, lockMode);
		if (user_details != null && user_details.length > 0)
			return user_details[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateUser_detailByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.User_detail as User_detail");
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
	
	public static java.util.Iterator iterateUser_detailByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.User_detail as User_detail");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User_detail", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static User_detail loadUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		User_detail[] user_details = listUser_detailByCriteria(user_detailCriteria);
		if(user_details == null || user_details.length == 0) {
			return null;
		}
		return user_details[0];
	}
	
	public static User_detail[] listUser_detailByCriteria(User_detailCriteria user_detailCriteria) {
		return user_detailCriteria.listUser_detail();
	}
	
	public static User_detail createUser_detail() {
		return new entities.User_detail();
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
			entities.Group_user[] lGroup_users = (entities.Group_user[])getGroup_user().toArray(new entities.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
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
			entities.Group_user[] lGroup_users = (entities.Group_user[])getGroup_user().toArray(new entities.Group_user[getGroup_user().size()]);
			for(int i = 0; i < lGroup_users.length; i++) {
				lGroup_users[i].setUser_detail(null);
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
	
	@Column(name="user_detail_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_USER_DETAIL_USER_DETAIL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_USER_DETAIL_USER_DETAIL_ID_GENERATOR", strategy="native")	
	private int user_detail_id;
	
	@Column(name="user_name", nullable=false, length=50)	
	private String user_name;
	
	@Column(name="user_password", nullable=false, length=100)	
	private String user_password;
	
	@Column(name="first_name", nullable=false, length=100)	
	private String first_name;
	
	@Column(name="second_name", nullable=false, length=100)	
	private String second_name;
	
	@Column(name="third_name", nullable=true, length=100)	
	private String third_name;
	
	@Column(name="position", nullable=false, length=100)	
	private String position;
	
	@Column(name="user_image", nullable=true, length=100)	
	private String image_name;
	
	@Column(name="is_user_gen_admin", nullable=false, length=1)	
	private int is_user_gen_admin;
	
	@Column(name="email_address", nullable=true, length=100)	
	private String email_address;
	
	@Column(name="is_deleted", nullable=true, length=1)	
	private Integer is_deleted;
	
	@Column(name="is_active", nullable=true, length=1)	
	private Integer is_active;
	
	@Column(name="add_date", nullable=true)	
	private java.sql.Timestamp add_date;
	
	@Column(name="add_by", nullable=true, length=11)	
	private Integer add_by;
	
	@Column(name="last_edit_date", nullable=true)	
	private java.sql.Timestamp last_edit_date;
	
	@Column(name="last_edit_by", nullable=true, length=11)	
	private Integer last_edit_by;
	
	@OneToMany(mappedBy="user_detail", targetEntity=entities.Group_user.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set group_user = new java.util.HashSet();
	
	private void setUser_detail_id(int value) {
		this.user_detail_id = value;
	}
	
	public int getUser_detail_id() {
		return user_detail_id;
	}
	
	public int getORMID() {
		return getUser_detail_id();
	}
	
	public void setUser_name(String value) {
		this.user_name = value;
	}
	
	public String getUser_name() {
		return user_name;
	}
	
	public void setUser_password(String value) {
		this.user_password = value;
	}
	
	public String getUser_password() {
		return user_password;
	}
	
	public void setPosition(String value) {
		this.position = value;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setImage_name(String value) {
		this.image_name = value;
	}
	
	public String getImage_name() {
		return image_name;
	}
	
	public void setIs_user_gen_admin(int value) {
		this.is_user_gen_admin = value;
	}
	
	public int getIs_user_gen_admin() {
		return is_user_gen_admin;
	}
	
	public void setEmail_address(String value) {
		this.email_address = value;
	}
	
	public String getEmail_address() {
		return email_address;
	}
	
	public void setFirst_name(String value) {
		this.first_name = value;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setSecond_name(String value) {
		this.second_name = value;
	}
	
	public String getSecond_name() {
		return second_name;
	}
	
	public void setThird_name(String value) {
		this.third_name = value;
	}
	
	public String getThird_name() {
		return third_name;
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
		setIs_active(new Integer(value));
	}
	
	public void setIs_active(Integer value) {
		this.is_active = value;
	}
	
	public Integer getIs_active() {
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
	
	public void setGroup_user(java.util.Set value) {
		this.group_user = value;
	}
	
	public java.util.Set getGroup_user() {
		return group_user;
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
		      User_detail object = (User_detail) obj;
		        return (this.getUser_detail_id() == object.getUser_detail_id());
	}
	
	public String toString() {
		return String.valueOf(getUser_detail_id());
	}
	
}
