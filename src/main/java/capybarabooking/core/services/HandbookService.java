package capybarabooking.core.services;

import capybarabooking.core.mappers.HandbookToConfigurationMapper;
import capybarabooking.core.models.Configuration;
import capybarabooking.core.models.Handbook;
import capybarabooking.core.repositories.HandbookRepository;
import capybarabooking.core.repositories.SysnameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HandbookService {

    @Autowired
    private HandbookRepository handbookRepository;

    @Autowired
    private SysnameRepository sysnameRepository;

    private HandbookToConfigurationMapper mapper;


    public Configuration findHandbookById(String sysname) {
        Integer configHandbookId = sysnameRepository.findAllByName(sysname).getHbdataverid();
        Handbook handbook = handbookRepository.findAllByHbdataverid(configHandbookId);
        return mapper.toConfiguration(handbook);
    }
}
