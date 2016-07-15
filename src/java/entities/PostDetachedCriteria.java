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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PostDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression post_id;
	public final StringExpression post_name;
	public final IntegerExpression countryId;
	public final AssociationExpression country;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final IntegerExpression divisionId;
	public final AssociationExpression division;
	public final IntegerExpression countyId;
	public final AssociationExpression county;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression candidate;
	public final CollectionExpression vote;
	
	public PostDetachedCriteria() {
		super(entities.Post.class, entities.PostCriteria.class);
		post_id = new IntegerExpression("post_id", this.getDetachedCriteria());
		post_name = new StringExpression("post_name", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.country_id", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		divisionId = new IntegerExpression("division.division_id", this.getDetachedCriteria());
		division = new AssociationExpression("division", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
		vote = new CollectionExpression("vote", this.getDetachedCriteria());
	}
	
	public PostDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.PostCriteria.class);
		post_id = new IntegerExpression("post_id", this.getDetachedCriteria());
		post_name = new StringExpression("post_name", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.country_id", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		divisionId = new IntegerExpression("division.division_id", this.getDetachedCriteria());
		division = new AssociationExpression("division", this.getDetachedCriteria());
		countyId = new IntegerExpression("county.county_id", this.getDetachedCriteria());
		county = new AssociationExpression("county", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		candidate = new CollectionExpression("candidate", this.getDetachedCriteria());
		vote = new CollectionExpression("vote", this.getDetachedCriteria());
	}
	
	public CountryDetachedCriteria createCountryCriteria() {
		return new CountryDetachedCriteria(createCriteria("country"));
	}
	
	public DistrictDetachedCriteria createDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("district"));
	}
	
	public DivisionDetachedCriteria createDivisionCriteria() {
		return new DivisionDetachedCriteria(createCriteria("division"));
	}
	
	public CountyDetachedCriteria createCountyCriteria() {
		return new CountyDetachedCriteria(createCriteria("county"));
	}
	
	public CandidateDetachedCriteria createCandidateCriteria() {
		return new CandidateDetachedCriteria(createCriteria("candidate"));
	}
	
	public VoteDetachedCriteria createVoteCriteria() {
		return new VoteDetachedCriteria(createCriteria("vote"));
	}
	
	public Post uniquePost(PersistentSession session) {
		return (Post) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Post[] listPost(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Post[]) list.toArray(new Post[list.size()]);
	}
}

