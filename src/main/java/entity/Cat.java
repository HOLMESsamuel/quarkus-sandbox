package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "CAT")
public class Cat{
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private String age;

	public String getName()  {
		return this.name;
	}

	public String getAge()  {
		return this.age;
	}

}
