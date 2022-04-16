package carrental.web.project.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import carrental.web.project.dto.CarRentalLocationDTO;
import carrental.web.project.entity.CarRentalLocation;

@Mapper(componentModel = "cdi")
public interface CarRentalLocationMapper extends GenericMapper<CarRentalLocationDTO, CarRentalLocation> {

	@Mapping(target = "pickupLocation", source = "pickupLocation")
	@Mapping(target = "returnLocation", source = "returnLocation")
	@Mapping(target = "carRentalDateAndTime", source = "carRentalDateAndTime")
	@Mapping(target = "carReturnDateAndTime", source = "carReturnDateAndTime")
	CarRentalLocationDTO convertDTOToEntity(CarRentalLocation carRentalLocation);

	@Mapping(target = "pickupLocation", source = "pickupLocation")
	@Mapping(target = "returnLocation", source = "returnLocation")
	@Mapping(target = "carRentalDateAndTime", source = "carRentalDateAndTime")
	@Mapping(target = "carReturnDateAndTime", source = "carReturnDateAndTime")
	CarRentalLocationDTO convertEntityToDTO(CarRentalLocationDTO carRentalLocationDTO);

}
