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

public class Group_detailDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression group_detail_id;
	public final StringExpression group_name;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	public final CollectionExpression group_rights;
	public final CollectionExpression group_user;
	
	public Group_detailDetachedCriteria() {
		super(entities.Group_detail.class, entities.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		group_rights = new CollectionExpression("group_rights", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
	}
	
	public Group_detailDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.Group_detailCriteria.class);
		group_detail_id = new IntegerExpression("group_detail_id", this.getDetachedCriteria());
		group_name = new StringExpression("group_name", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
		group_rights = new CollectionExpression("group_rights", this.getDetachedCriteria());
		group_user = new CollectionExpression("group_user", this.getDetachedCriteria());
	}
	
	public Group_rightDetachedCriteria createGroup_rightsCriteria() {
		return new Group_rightDetachedCriteria(createCriteria("group_rights"));
	}
	
	public Group_userDetachedCriteria createGroup_userCriteria() {
		return new Group_userDetachedCriteria(createCriteria("group_user"));
	}
	
	public Group_detail uniqueGroup_detail(PersistentSession session) {
		return (Group_detail) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Group_detail[] listGroup_detail(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Group_detail[]) list.toArray(new Group_detail[list.size()]);
	}
}

