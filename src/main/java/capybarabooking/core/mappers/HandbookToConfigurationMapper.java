package capybarabooking.core.mappers;

import capybarabooking.core.models.Configuration;
import capybarabooking.core.models.Handbook;
import capybarabooking.core.services.HandbookService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = HandbookService.class)
public interface HandbookToConfigurationMapper {

    @Mapping(target = "driverClassName", source = "handbook.stringfield00")
    @Mapping(target = "url", source = "handbook.stringfield01")
    @Mapping(target = "username", source = "handbook.stringfield02")
    @Mapping(target = "password", source = "handbook.stringfield03")
    Configuration toConfiguration(Handbook handbook);
}
