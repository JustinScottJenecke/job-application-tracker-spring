package io.github.justinscottjenecke.job_application_manager.service.mappers;

import io.github.justinscottjenecke.job_application_manager.dto.application.ApplicationDetailsDto;
import io.github.justinscottjenecke.job_application_manager.dto.application.CreateApplicationDto;
import io.github.justinscottjenecke.job_application_manager.model.Application;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {

    /**
     * Maps the properties of an ApplicationDetailsDto to an Application Entity
     * @param dto ApplicationDetailsDto
     * @return Application
     */
    public static Application applicationDetailsToApplication(ApplicationDetailsDto dto) {
        return null;
    }

    /**
     * Maps the properties of an ApplicationDetailsDto to an Application Entity
     * @param dto CreateApplicationDto
     * @return Application
     */
    public Application createApplicationToApplication(CreateApplicationDto dto) {
        return null;
    }

    /**
     * Maps the properties of an Application to an ApplicationDetailsDto Dto
     * @param application Application
     * @return ApplicationDetailsDto
     */
    public ApplicationDetailsDto applicationToApplicationDetails(Application application) {
        return null;
    }

    /**
     * Maps the properties of an ApplicationDetailsDto to an Application Entity
     * @param application Application
     * @return CreateApplicationDto
     */
    public CreateApplicationDto applicationToCreateApplication(Application application) {
        return null;
    }
}