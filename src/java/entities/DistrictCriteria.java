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

public class DistrictCriteria extends AbstractORMCriteria {
	public final IntegerExpression district_id;
	public final StringExpression district_name;
	public final IntegerExpression countryId;
	public final AssociationExpression country;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression county;
	public final CollectionExpression post;
	public final CollectionExpression division_;
	public final CollectionExpression voter;
	
	public DistrictCriteria(Criteria criteria) {
		super(criteria);
		district_id = new IntegerExpression("district_id", this);
		district_name = new StringExpression("district_name", this);
		countryId = new IntegerExpression("country.country_id", this);
		country = new AssociationExpression("country", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
		county = new CollectionExpression("county", this);
		post = new CollectionExpression("post", this);
		division_ = new CollectionExpression("division_", this);
		voter = new CollectionExpression("voter", this);
	}
	
	public DistrictCriteria(PersistentSession session) {
		this(session.createCriteria(District.class));
	}
	
	public DistrictCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public CountryCriteria createCountryCriteria() {
		return new CountryCriteria(createCriteria("country"));
	}
	
	public CountyCriteria createCountyCriteria() {
		return new CountyCriteria(createCriteria("county"));
	}
	
	public PostCriteria createPostCriteria() {
		return new PostCriteria(createCriteria("post"));
	}
	
	public DivisionCriteria createDivision_Criteria() {
		return new DivisionCriteria(createCriteria("division_"));
	}
	
	public VoterCriteria createVoterCriteria() {
		return new VoterCriteria(createCriteria("voter"));
	}
	
	public District uniqueDistrict() {
		return (District) super.uniqueResult();
	}
	
	public District[] listDistrict() {
		java.util.List list = super.list();
		return (District[]) list.toArray(new District[list.size()]);
	}
}

