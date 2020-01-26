package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
@Table(name = "dam_details")
public class DamEntity implements Serializable {
	@Id
	@GenericGenerator(name = "rakshith", strategy = "increment")
	@GeneratedValue(generator = "rakshith")
	@Column(name = "d_id")
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_place")
	private String place;
	@Column(name = "d_depth")
	private double depth;
	
	public DamEntity() {
		System.out.println("Entiry created"+getClass().getCanonicalName());
	}
	
	public DamEntity(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
}
