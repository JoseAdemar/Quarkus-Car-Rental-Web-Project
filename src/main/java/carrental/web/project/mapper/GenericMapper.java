package carrental.web.project.mapper;

import java.util.List;

public interface GenericMapper<MyDTO, MyEntity> {

	MyDTO convertToEntity(MyEntity entity);

	List<MyDTO> convertToEntity(List<MyEntity> entityList);

	MyEntity convertTo(MyDTO dto);

	List<MyEntity> convertToDTO(List<MyDTO> dtoList);
}
