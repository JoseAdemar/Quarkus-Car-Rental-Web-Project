package carrental.web.project.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CarRentalLocationDTO {
	
	private Long id;

	private String pickupLocation;

	private String returnLocation;

	private LocalDateTime carRentalDateAndTime;

	private LocalDateTime carReturnDateAndTime;

}
