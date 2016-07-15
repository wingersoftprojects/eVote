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

public class PostCriteria extends AbstractORMCriteria {
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
	
	public PostCriteria(Criteria criteria) {
		super(criteria);
		post_id = new IntegerExpression("post_id", this);
		post_name = new StringExpression("post_name", this);
		countryId = new IntegerExpression("country.country_id", this);
		country = new AssociationExpression("country", this);
		districtId = new IntegerExpression("district.district_id", this);
		district = new AssociationExpression("district", this);
		divisionId = new IntegerExpression("division.division_id", this);
		division = new AssociationExpression("division", this);
		countyId = new IntegerExpression("county.county_id", this);
		county = new AssociationExpression("county", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		candidate = new CollectionExpression("candidate", this);
		vote = new CollectionExpression("vote", this);
	}
	
	public PostCriteria(PersistentSession session) {
		this(session.createCriteria(Post.class));
	}
	
	public PostCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public CountryCriteria createCountryCriteria() {
		return new CountryCriteria(createCriteria("country"));
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public DivisionCriteria createDivisionCriteria() {
		return new DivisionCriteria(createCriteria("division"));
	}
	
	public CountyCriteria createCountyCriteria() {
		return new CountyCriteria(createCriteria("county"));
	}
	
	public CandidateCriteria createCandidateCriteria() {
		return new CandidateCriteria(createCriteria("candidate"));
	}
	
	public VoteCriteria createVoteCriteria() {
		return new VoteCriteria(createCriteria("vote"));
	}
	
	public Post uniquePost() {
		return (Post) super.uniqueResult();
	}
	
	public Post[] listPost() {
		java.util.List list = super.list();
		return (Post[]) list.toArray(new Post[list.size()]);
	}
}

