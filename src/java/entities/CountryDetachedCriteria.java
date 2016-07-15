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

public class CountryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression country_id;
	public final StringExpression country_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression district;
	public final CollectionExpression post;
	
	public CountryDetachedCriteria() {
		super(entities.Country.class, entities.CountryCriteria.class);
		country_id = new IntegerExpression("country_id", this.getDetachedCriteria());
		country_name = new StringExpression("country_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		district = new CollectionExpression("district", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
	}
	
	public CountryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.CountryCriteria.class);
		country_id = new IntegerExpression("country_id", this.getDetachedCriteria());
		country_name = new StringExpression("country_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		district = new CollectionExpression("district", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria createDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("district"));
	}
	
	public PostDetachedCriteria createPostCriteria() {
		return new PostDetachedCriteria(createCriteria("post"));
	}
	
	public Country uniqueCountry(PersistentSession session) {
		return (Country) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Country[] listCountry(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Country[]) list.toArray(new Country[list.size()]);
	}
}

