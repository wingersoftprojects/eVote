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
@Table(name="voter")
public class Voter implements Serializable {
	public Voter() {
	}
	
	public static Voter loadVoterByORMID(int voter_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVoterByORMID(session, voter_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter getVoterByORMID(int voter_id) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getVoterByORMID(session, voter_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByORMID(int voter_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVoterByORMID(session, voter_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter getVoterByORMID(int voter_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return getVoterByORMID(session, voter_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByORMID(PersistentSession session, int voter_id) throws PersistentException {
		try {
			return (Voter) session.load(entities.Voter.class, new Integer(voter_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter getVoterByORMID(PersistentSession session, int voter_id) throws PersistentException {
		try {
			return (Voter) session.get(entities.Voter.class, new Integer(voter_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByORMID(PersistentSession session, int voter_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Voter) session.load(entities.Voter.class, new Integer(voter_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter getVoterByORMID(PersistentSession session, int voter_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Voter) session.get(entities.Voter.class, new Integer(voter_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVoter(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryVoter(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVoter(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return queryVoter(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter[] listVoterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listVoterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter[] listVoterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return listVoterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVoter(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Voter as Voter");
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
	
	public static List queryVoter(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Voter as Voter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Voter", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter[] listVoterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVoter(session, condition, orderBy);
			return (Voter[]) list.toArray(new Voter[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter[] listVoterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVoter(session, condition, orderBy, lockMode);
			return (Voter[]) list.toArray(new Voter[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVoterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return loadVoterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Voter[] voters = listVoterByQuery(session, condition, orderBy);
		if (voters != null && voters.length > 0)
			return voters[0];
		else
			return null;
	}
	
	public static Voter loadVoterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Voter[] voters = listVoterByQuery(session, condition, orderBy, lockMode);
		if (voters != null && voters.length > 0)
			return voters[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVoterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateVoterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVoterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entities.EVotingPersistentManager.instance().getSession();
			return iterateVoterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVoterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Voter as Voter");
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
	
	public static java.util.Iterator iterateVoterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entities.Voter as Voter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Voter", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Voter loadVoterByCriteria(VoterCriteria voterCriteria) {
		Voter[] voters = listVoterByCriteria(voterCriteria);
		if(voters == null || voters.length == 0) {
			return null;
		}
		return voters[0];
	}
	
	public static Voter[] listVoterByCriteria(VoterCriteria voterCriteria) {
		return voterCriteria.listVoter();
	}
	
	public static Voter createVoter() {
		return new entities.Voter();
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
			if(getPolling_station() != null) {
				getPolling_station().getVoter().remove(this);
			}
			
			if(getVillage() != null) {
				getVillage().getVoter().remove(this);
			}
			
			if(getSub_county() != null) {
				getSub_county().getVoter().remove(this);
			}
			
			if(getCounty() != null) {
				getCounty().getVoter().remove(this);
			}
			
			if(getDistrict() != null) {
				getDistrict().getVoter().remove(this);
			}
			
			if(getParish() != null) {
				getParish().getVoter().remove(this);
			}
			
			entities.Finger_print[] lFinger_prints = (entities.Finger_print[])getFinger_print().toArray(new entities.Finger_print[getFinger_print().size()]);
			for(int i = 0; i < lFinger_prints.length; i++) {
				lFinger_prints[i].setVoter(null);
			}
			entities.Candidate[] lCandidates = (entities.Candidate[])getCandidate().toArray(new entities.Candidate[getCandidate().size()]);
			for(int i = 0; i < lCandidates.length; i++) {
				lCandidates[i].setVoter(null);
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
			if(getPolling_station() != null) {
				getPolling_station().getVoter().remove(this);
			}
			
			if(getVillage() != null) {
				getVillage().getVoter().remove(this);
			}
			
			if(getSub_county() != null) {
				getSub_county().getVoter().remove(this);
			}
			
			if(getCounty() != null) {
				getCounty().getVoter().remove(this);
			}
			
			if(getDistrict() != null) {
				getDistrict().getVoter().remove(this);
			}
			
			if(getParish() != null) {
				getParish().getVoter().remove(this);
			}
			
			entities.Finger_print[] lFinger_prints = (entities.Finger_print[])getFinger_print().toArray(new entities.Finger_print[getFinger_print().size()]);
			for(int i = 0; i < lFinger_prints.length; i++) {
				lFinger_prints[i].setVoter(null);
			}
			entities.Candidate[] lCandidates = (entities.Candidate[])getCandidate().toArray(new entities.Candidate[getCandidate().size()]);
			for(int i = 0; i < lCandidates.length; i++) {
				lCandidates[i].setVoter(null);
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
	
	@Column(name="voter_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ENTITIES_VOTER_VOTER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ENTITIES_VOTER_VOTER_ID_GENERATOR", strategy="native")	
	private int voter_id;
	
	@ManyToOne(targetEntity=entities.Polling_station.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="polling_station_id", referencedColumnName="polling_station_id", nullable=false) })	
	private entities.Polling_station polling_station;
	
	@ManyToOne(targetEntity=entities.Village.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="village_id", referencedColumnName="village_id", nullable=false) })	
	private entities.Village village;
	
	@Column(name="sur_name", nullable=true, length=100)	
	private String sur_name;
	
	@Column(name="given_names", nullable=true, length=100)	
	private String given_names;
	
	@Column(name="sex", nullable=true, length=100)	
	private String sex;
	
	@Column(name="tittle", nullable=true, length=100)	
	private String tittle;
	
	@Column(name="dob", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date dob;
	
	@Column(name="image_name", nullable=true, length=100)	
	private String image_name;
	
	@Column(name="image_blob", nullable=true)	
	private java.sql.Blob image_blob;
	
	@ManyToOne(targetEntity=entities.Sub_county.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="sub_county_id", referencedColumnName="sub_county_id", nullable=false) })	
	private entities.Sub_county sub_county;
	
	@ManyToOne(targetEntity=entities.County.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="county_id", referencedColumnName="county_id", nullable=false) })	
	private entities.County county;
	
	@ManyToOne(targetEntity=entities.District.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="district_id", referencedColumnName="district_id", nullable=false) })	
	private entities.District district;
	
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
	
	@ManyToOne(targetEntity=entities.Parish.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="parish_id", referencedColumnName="parish_id") })	
	private entities.Parish parish;
	
	@OneToMany(mappedBy="voter", targetEntity=entities.Finger_print.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set finger_print = new java.util.HashSet();
	
	@OneToMany(mappedBy="voter", targetEntity=entities.Candidate.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.EXTRA)	
	private java.util.Set candidate = new java.util.HashSet();
	
	private void setVoter_id(int value) {
		this.voter_id = value;
	}
	
	public int getVoter_id() {
		return voter_id;
	}
	
	public int getORMID() {
		return getVoter_id();
	}
	
	public void setSur_name(String value) {
		this.sur_name = value;
	}
	
	public String getSur_name() {
		return sur_name;
	}
	
	public void setGiven_names(String value) {
		this.given_names = value;
	}
	
	public String getGiven_names() {
		return given_names;
	}
	
	public void setSex(String value) {
		this.sex = value;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setTittle(String value) {
		this.tittle = value;
	}
	
	public String getTittle() {
		return tittle;
	}
	
	public void setDob(java.util.Date value) {
		this.dob = value;
	}
	
	public java.util.Date getDob() {
		return dob;
	}
	
	public void setImage_name(String value) {
		this.image_name = value;
	}
	
	public String getImage_name() {
		return image_name;
	}
	
	public void setImage_blob(java.sql.Blob value) {
		this.image_blob = value;
	}
	
	public java.sql.Blob getImage_blob() {
		return image_blob;
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
	
	public void setPolling_station(entities.Polling_station value) {
		this.polling_station = value;
	}
	
	public entities.Polling_station getPolling_station() {
		return polling_station;
	}
	
	public void setParish(entities.Parish value) {
		this.parish = value;
	}
	
	public entities.Parish getParish() {
		return parish;
	}
	
	public void setSub_county(entities.Sub_county value) {
		this.sub_county = value;
	}
	
	public entities.Sub_county getSub_county() {
		return sub_county;
	}
	
	public void setCounty(entities.County value) {
		this.county = value;
	}
	
	public entities.County getCounty() {
		return county;
	}
	
	public void setDistrict(entities.District value) {
		this.district = value;
	}
	
	public entities.District getDistrict() {
		return district;
	}
	
	public void setVillage(entities.Village value) {
		this.village = value;
	}
	
	public entities.Village getVillage() {
		return village;
	}
	
	public void setFinger_print(java.util.Set value) {
		this.finger_print = value;
	}
	
	public java.util.Set getFinger_print() {
		return finger_print;
	}
	
	
	public void setCandidate(java.util.Set value) {
		this.candidate = value;
	}
	
	public java.util.Set getCandidate() {
		return candidate;
	}
	
	
	public String toString() {
		return String.valueOf(getVoter_id());
	}
	
}
