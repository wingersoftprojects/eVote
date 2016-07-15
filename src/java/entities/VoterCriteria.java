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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VoterCriteria extends AbstractORMCriteria {
	public final IntegerExpression voter_id;
	public final StringExpression voter_name;
	public final IntegerExpression polling_stationId;
	public final AssociationExpression polling_station;
	public final StringExpression sur_name;
	public final StringExpression given_names;
	public final StringExpression sex;
	public final StringExpression tittle;
	public final DateExpression dob;
	public final StringExpression image_name;
	public final IntegerExpression parishId;
	public final AssociationExpression parish;
	public final IntegerExpression sub_countyId;
	public final AssociationExpression sub_county;
	public final IntegerExpression countyId;
	public final AssociationExpression county;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression finger_print;
	public final CollectionExpression candidate;
	
	public VoterCriteria(Criteria criteria) {
		super(criteria);
		voter_id = new IntegerExpression("voter_id", this);
		voter_name = new StringExpression("voter_name", this);
		polling_stationId = new IntegerExpression("polling_station.polling_station_id", this);
		polling_station = new AssociationExpression("polling_station", this);
		sur_name = new StringExpression("sur_name", this);
		given_names = new StringExpression("given_names", this);
		sex = new StringExpression("sex", this);
		tittle = new StringExpression("tittle", this);
		dob = new DateExpression("dob", this);
		image_name = new StringExpression("image_name", this);
		parishId = new IntegerExpression("parish.parish_id", this);
		parish = new AssociationExpression("parish", this);
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this);
		sub_county = new AssociationExpression("sub_county", this);
		countyId = new IntegerExpression("county.county_id", this);
		county = new AssociationExpression("county", this);
		districtId = new IntegerExpression("district.district_id", this);
		district = new AssociationExpression("district", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		finger_print = new CollectionExpression("finger_print", this);
		candidate = new CollectionExpression("candidate", this);
	}
	
	public VoterCriteria(PersistentSession session) {
		this(session.createCriteria(Voter.class));
	}
	
	public VoterCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public Polling_stationCriteria createPolling_stationCriteria() {
		return new Polling_stationCriteria(createCriteria("polling_station"));
	}
	
	public ParishCriteria createParishCriteria() {
		return new ParishCriteria(createCriteria("parish"));
	}
	
	public Sub_countyCriteria createSub_countyCriteria() {
		return new Sub_countyCriteria(createCriteria("sub_county"));
	}
	
	public CountyCriteria createCountyCriteria() {
		return new CountyCriteria(createCriteria("county"));
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public Finger_printCriteria createFinger_printCriteria() {
		return new Finger_printCriteria(createCriteria("finger_print"));
	}
	
	public CandidateCriteria createCandidateCriteria() {
		return new CandidateCriteria(createCriteria("candidate"));
	}
	
	public Voter uniqueVoter() {
		return (Voter) super.uniqueResult();
	}
	
	public Voter[] listVoter() {
		java.util.List list = super.list();
		return (Voter[]) list.toArray(new Voter[list.size()]);
	}
}
