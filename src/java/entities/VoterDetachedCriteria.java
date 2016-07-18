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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class VoterDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression voter_id;
	public final StringExpression voter_name;
	public final IntegerExpression polling_stationId;
	public final AssociationExpression polling_station;
	public final IntegerExpression villageId;
	public final AssociationExpression village;
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
	
	public VoterDetachedCriteria() {
		super(entities.Voter.class, entities.VoterCriteria.class);
		voter_id = new IntegerExpression("voter_id", this.getDetachedCriteria());
		voter_name = new StringExpression("voter_name", this.getDetachedCriteria());
		polling_stationId = new IntegerExpression("polling_station.polling_station_id", this.getDetachedCriteria());
		polling_station = new AssociationExpression("polling_station", this.getDetachedCriteria());
		villageId = new IntegerExpression("village.village_id", this.getDetachedCriteria());
		village = new AssociationExpression("village", this.getDetachedCriteria());
		sur_name = new StringExpression("sur_name", this.getDetachedCriteria());
		given_names = new StringExpression("given_names", this.getDetachedCriteria());
		sex = new StringExpression("sex", this.getDetachedCriteria());
		tittle = new StringExpression("tittle", this.getDetachedCriteria());
		dob = new DateExpression("dob", this.getDetachedCriteria());
		image_name = new StringExpression("image_name", this.getDetachedCriteria());
		parishId = new IntegerExpression("parish.parish_id", this.getDetachedCriteria());
		parish = new AssociationExpression("parish", this.getDetachedCriteria());
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this.getDetachedCriteria());
		sub_county = new AssociationExpression("sub_county", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		finger_print = new CollectionExpression("finger_print", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
	}
	
	public VoterDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.VoterCriteria.class);
		voter_id = new IntegerExpression("voter_id", this.getDetachedCriteria());
		voter_name = new StringExpression("voter_name", this.getDetachedCriteria());
		polling_stationId = new IntegerExpression("polling_station.polling_station_id", this.getDetachedCriteria());
		polling_station = new AssociationExpression("polling_station", this.getDetachedCriteria());
		villageId = new IntegerExpression("village.village_id", this.getDetachedCriteria());
		village = new AssociationExpression("village", this.getDetachedCriteria());
		sur_name = new StringExpression("sur_name", this.getDetachedCriteria());
		given_names = new StringExpression("given_names", this.getDetachedCriteria());
		sex = new StringExpression("sex", this.getDetachedCriteria());
		tittle = new StringExpression("tittle", this.getDetachedCriteria());
		dob = new DateExpression("dob", this.getDetachedCriteria());
		image_name = new StringExpression("image_name", this.getDetachedCriteria());
		parishId = new IntegerExpression("parish.parish_id", this.getDetachedCriteria());
		parish = new AssociationExpression("parish", this.getDetachedCriteria());
		sub_countyId = new IntegerExpression("sub_county.sub_county_id", this.getDetachedCriteria());
		sub_county = new AssociationExpression("sub_county", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		finger_print = new CollectionExpression("finger_print", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
	}
	
	public Polling_stationDetachedCriteria createPolling_stationCriteria() {
		return new Polling_stationDetachedCriteria(createCriteria("polling_station"));
	}
	
	public VillageDetachedCriteria createVillageCriteria() {
		return new VillageDetachedCriteria(createCriteria("village"));
	}
	
	public ParishDetachedCriteria createParishCriteria() {
		return new ParishDetachedCriteria(createCriteria("parish"));
	}
	
	public Sub_countyDetachedCriteria createSub_countyCriteria() {
		return new Sub_countyDetachedCriteria(createCriteria("sub_county"));
	}
	
	public CountyDetachedCriteria createCountyCriteria() {
		return new CountyDetachedCriteria(createCriteria("county"));
	}
	
	public DistrictDetachedCriteria createDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("district"));
	}
	
	public Finger_printDetachedCriteria createFinger_printCriteria() {
		return new Finger_printDetachedCriteria(createCriteria("finger_print"));
	}
	
	public CandidateDetachedCriteria createCandidateCriteria() {
		return new CandidateDetachedCriteria(createCriteria("candidate"));
	}
	
	public Voter uniqueVoter(PersistentSession session) {
		return (Voter) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Voter[] listVoter(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Voter[]) list.toArray(new Voter[list.size()]);
	}
}

