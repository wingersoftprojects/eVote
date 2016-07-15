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
@Table(name="post")
public class Post implements Serializable {
	public Post() {
	}
	
	public static Post loadPostByORMID(int post_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadPostByORMID(session, post_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post getPostByORMID(int post_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getPostByORMID(session, post_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByORMID(int post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadPostByORMID(session, post_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post getPostByORMID(int post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getPostByORMID(session, post_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByORMID(PersistentSession session, int post_id) throws PersistentException {
		try {
			return (Post) session.load(entities.Post.class, new Integer(post_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post getPostByORMID(PersistentSession session, int post_id) throws PersistentException {
		try {
			return (Post) session.get(entities.Post.class, new Integer(post_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByORMID(PersistentSession session, int post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Post) session.load(entities.Post.class, new Integer(post_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post getPostByORMID(PersistentSession session, int post_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Post) session.get(entities.Post.class, new Integer(post_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPost(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryPost(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPost(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryPost(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post[] listPostByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listPostByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post[] listPostByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listPostByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPost(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Post as Post");
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
	
	public static List queryPost(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Post as Post");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Post", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post[] listPostByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPost(session, condition, orderBy);
			return (Post[]) list.toArray(new Post[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post[] listPostByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPost(session, condition, orderBy, lockMode);
			return (Post[]) list.toArray(new Post[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadPostByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadPostByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Post[] posts = listPostByQuery(session, condition, orderBy);
		if (posts != null && posts.length > 0)
			return posts[0];
		else
			return null;
	}
	
	public static Post loadPostByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Post[] posts = listPostByQuery(session, condition, orderBy, lockMode);
		if (posts != null && posts.length > 0)
			return posts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePostByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iteratePostByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePostByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iteratePostByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePostByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Post as Post");
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
	
	public static java.util.Iterator iteratePostByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Post as Post");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Post", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Post loadPostByCriteria(PostCriteria postCriteria) {
		Post[] posts = listPostByCriteria(postCriteria);
		if(posts == null || posts.length == 0) {
			return null;
		}
		return posts[0];
	}
	
	public static Post[] listPostByCriteria(PostCriteria postCriteria) {
		return postCriteria.listPost();
	}
	
	public static Post createPost() {
		return new entities.Post();
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
			if(getCountry() != null) {
				getCountry().getPost().remove(this);
			}
			
			if(getDistrict() != null) {
				getDistrict().getPost().remove(this);
			}
			
			if(getDivision() != null) {
				getDivision().getPost().remove(this);
			}
			
			if(getCounty() != null) {
				getCounty().getPost().remove(this);
			}
			
			entities.Candidate[] lCandidates = (entities.Candidate[])getCandidate().toArray(new entities.Candidate[getCandidate().size()]);
			for(int i = 0; i < lCandidates.length; i++) {
				lCandidates[i].setPost(null);
			}
			entities.Vote[] lVotes = (entities.Vote[])getVote().toArray(new entities.Vote[getVote().size()]);
			for(int i = 0; i < lVotes.length; i++) {
				lVotes[i].setPost(null);
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
			if(getCountry() != null) {
				getCountry().getPost().remove(this);
			}
			
			if(getDistrict() != null) {
				getDistrict().getPost().remove(this);
			}
			
			if(getDivision() != null) {
				getDivision().getPost().remove(this);
			}
			
			if(getCounty() != null) {
				getCounty().getPost().remove(this);
			}
			
			entities.Candidate[] lCandidates = (entities.Candidate[])getCandidate().toArray(new entities.Candidate[getCandidate().size()]);
			for(int i = 0; i < lCandidates.length; i++) {
				lCandidates[i].setPost(null);
			}
			entities.Vote[] lVotes = (entities.Vote[])getVote().toArray(new entities.Vote[getVote().size()]);
			for(int i = 0; i < lVotes.length; i++) {
				lVotes[i].setPost(null);
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
	
	@Column(name="post_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_POST_POST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_POST_POST_ID_GENERATOR", strategy="native")	
	private int post_id;
	
	@Column(name="post_name", nullable=false, length=100)	
	private String post_name;
	
	@ManyToOne(targetEntity=entities.Country.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="country_id", referencedColumnName="country_id", nullable=false) })	
	private entities.Country country;
	
	@ManyToOne(targetEntity=entities.District.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="district_id", referencedColumnName="district_id", nullable=false) })	
	private entities.District district;
	
	@ManyToOne(targetEntity=entities.Division.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="division_id", referencedColumnName="division_id", nullable=false) })	
	private entities.Division division;
	
	@ManyToOne(targetEntity=entities.County.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="county_id", referencedColumnName="county_id", nullable=false) })	
	private entities.County county;
	
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
	
	@OneToMany(mappedBy="post", targetEntity=entities.Candidate.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set candidate = new java.util.HashSet();
	
	@OneToMany(mappedBy="post", targetEntity=entities.Vote.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set vote = new java.util.HashSet();
	
	private void setPost_id(int value) {
		this.post_id = value;
	}
	
	public int getPost_id() {
		return post_id;
	}
	
	public int getORMID() {
		return getPost_id();
	}
	
	public void setPost_name(String value) {
		this.post_name = value;
	}
	
	public String getPost_name() {
		return post_name;
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
	
	public void setDivision(entities.Division value) {
		this.division = value;
	}
	
	public entities.Division getDivision() {
		return division;
	}
	
	public void setCountry(entities.Country value) {
		this.country = value;
	}
	
	public entities.Country getCountry() {
		return country;
	}
	
	public void setCounty(entities.County value) {
		this.county = value;
	}
	
	public entities.County getCounty() {
		return county;
	}
	
	public void setCandidate(java.util.Set value) {
		this.candidate = value;
	}
	
	public java.util.Set getCandidate() {
		return candidate;
	}
	
	
	public void setVote(java.util.Set value) {
		this.vote = value;
	}
	
	public java.util.Set getVote() {
		return vote;
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
		      Post object = (Post) obj;
		        return (this.getPost_id() == object.getPost_id());
	}
	
	public String toString() {
		return String.valueOf(getPost_id());
	}
	
}
