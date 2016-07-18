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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Group_rightCriteria extends AbstractORMCriteria {
	public final IntegerExpression group_right_id;
	public final IntegerExpression groupId;
	public final AssociationExpression group;
	public final StringExpression function_name;
	public final IntegerExpression allow_view;
	public final IntegerExpression allow_add;
	public final IntegerExpression allow_edit;
	public final IntegerExpression allow_delete;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	
	public Group_rightCriteria(Criteria criteria) {
		super(criteria);
		group_right_id = new IntegerExpression("group_right_id", this);
		groupId = new IntegerExpression("group.group_detail_id", this);
		group = new AssociationExpression("group", this);
		function_name = new StringExpression("function_name", this);
		allow_view = new IntegerExpression("allow_view", this);
		allow_add = new IntegerExpression("allow_add", this);
		allow_edit = new IntegerExpression("allow_edit", this);
		allow_delete = new IntegerExpression("allow_delete", this);
		is_deleted = new IntegerExpression("is_deleted", this);
		is_active = new IntegerExpression("is_active", this);
		add_date = new TimestampExpression("add_date", this);
		add_by = new IntegerExpression("add_by", this);
		last_edit_date = new TimestampExpression("last_edit_date", this);
		last_edit_by = new IntegerExpression("last_edit_by", this);
	}
	
	public Group_rightCriteria(PersistentSession session) {
		this(session.createCriteria(Group_right.class));
	}
	
	public Group_rightCriteria() throws PersistentException {
		this(entities.EVotingPersistentManager.instance().getSession());
	}
	
	public Group_detailCriteria createGroupCriteria() {
		return new Group_detailCriteria(createCriteria("group"));
	}
	
	public Group_right uniqueGroup_right() {
		return (Group_right) super.uniqueResult();
	}
	
	public Group_right[] listGroup_right() {
		java.util.List list = super.list();
		return (Group_right[]) list.toArray(new Group_right[list.size()]);
	}
}

