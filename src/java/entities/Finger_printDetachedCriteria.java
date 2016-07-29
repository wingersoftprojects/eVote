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

public class Finger_printDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression finger_print_id;
	public final StringExpression fingerprint_name;
	public final BlobExpression fingerprint_blob;
	public final IntegerExpression voterId;
	public final AssociationExpression voter;
	public final IntegerExpression is_deleted;
	public final IntegerExpression is_active;
	public final TimestampExpression add_date;
	public final IntegerExpression add_by;
	public final TimestampExpression last_edit_date;
	public final IntegerExpression last_edit_by;
	
	public Finger_printDetachedCriteria() {
		super(entities.Finger_print.class, entities.Finger_printCriteria.class);
		finger_print_id = new IntegerExpression("finger_print_id", this.getDetachedCriteria());
		fingerprint_name = new StringExpression("fingerprint_name", this.getDetachedCriteria());
		fingerprint_blob = new BlobExpression("fingerprint_blob", this.getDetachedCriteria());
		voterId = new IntegerExpression("voter.voter_id", this.getDetachedCriteria());
		voter = new AssociationExpression("voter", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public Finger_printDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entities.Finger_printCriteria.class);
		finger_print_id = new IntegerExpression("finger_print_id", this.getDetachedCriteria());
		fingerprint_name = new StringExpression("fingerprint_name", this.getDetachedCriteria());
		fingerprint_blob = new BlobExpression("fingerprint_blob", this.getDetachedCriteria());
		voterId = new IntegerExpression("voter.voter_id", this.getDetachedCriteria());
		voter = new AssociationExpression("voter", this.getDetachedCriteria());
		is_deleted = new IntegerExpression("is_deleted", this.getDetachedCriteria());
		is_active = new IntegerExpression("is_active", this.getDetachedCriteria());
		add_date = new TimestampExpression("add_date", this.getDetachedCriteria());
		add_by = new IntegerExpression("add_by", this.getDetachedCriteria());
		last_edit_date = new TimestampExpression("last_edit_date", this.getDetachedCriteria());
		last_edit_by = new IntegerExpression("last_edit_by", this.getDetachedCriteria());
	}
	
	public VoterDetachedCriteria createVoterCriteria() {
		return new VoterDetachedCriteria(createCriteria("voter"));
	}
	
	public Finger_print uniqueFinger_print(PersistentSession session) {
		return (Finger_print) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Finger_print[] listFinger_print(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Finger_print[]) list.toArray(new Finger_print[list.size()]);
	}
}

