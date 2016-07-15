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

public class DistrictDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public DistrictDetachedCriteria() {
		super(entities.District.class, entities.DistrictCriteria.class);
		district_id = new IntegerExpression("district_id", this.getDetachedCriteria());
		district_name = new StringExpression("district_name", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.country_id", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		county = new CollectionExpression("county", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
		division_ = new CollectionExpression("division_", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.DistrictCriteria.class);
		district_id = new IntegerExpression("district_id", this.getDetachedCriteria());
		district_name = new StringExpression("district_name", this.getDetachedCriteria());
		countryId = new IntegerExpression("country.country_id", this.getDetachedCriteria());
		country = new AssociationExpression("country", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		county = new CollectionExpression("county", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
		division_ = new CollectionExpression("division_", this.getDetachedCriteria());
		voter = new CollectionExpression("voter", this.getDetachedCriteria());
	}
	
	public CountryDetachedCriteria createCountryCriteria() {
		return new CountryDetachedCriteria(createCriteria("country"));
	}
	
	public CountyDetachedCriteria createCountyCriteria() {
		return new CountyDetachedCriteria(createCriteria("county"));
	}
	
	public PostDetachedCriteria createPostCriteria() {
		return new PostDetachedCriteria(createCriteria("post"));
	}
	
	public DivisionDetachedCriteria createDivision_Criteria() {
		return new DivisionDetachedCriteria(createCriteria("division_"));
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public District uniqueDistrict(PersistentSession session) {
		return (District) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public District[] listDistrict(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (District[]) list.toArray(new District[list.size()]);
	}
}

