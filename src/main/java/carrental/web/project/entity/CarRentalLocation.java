package carrental.web.project.entity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "tbl_car_rental_location")
public class CarRentalLocation {

	@Id	
	@EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String pickupLocation;
    
	@NotNull
	private String returnLocation;

	@NotNull
	private LocalDateTime carRentalDateAndTime;

	@NotNull
	private LocalDateTime carReturnDateAndTime;

}
