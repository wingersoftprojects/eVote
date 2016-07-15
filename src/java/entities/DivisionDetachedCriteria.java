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

public class DivisionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression division_id;
	public final StringExpression division_name;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression post;
	
	public DivisionDetachedCriteria() {
		super(entities.Division.class, entities.DivisionCriteria.class);
		division_id = new IntegerExpression("division_id", this.getDetachedCriteria());
		division_name = new StringExpression("division_name", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
	}
	
	public DivisionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.DivisionCriteria.class);
		division_id = new IntegerExpression("division_id", this.getDetachedCriteria());
		division_name = new StringExpression("division_name", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.district_id", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		post = new CollectionExpression("post", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria createDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("district"));
	}
	
	public PostDetachedCriteria createPostCriteria() {
		return new PostDetachedCriteria(createCriteria("post"));
	}
	
	public Division uniqueDivision(PersistentSession session) {
		return (Division) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Division[] listDivision(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Division[]) list.toArray(new Division[list.size()]);
	}
}

