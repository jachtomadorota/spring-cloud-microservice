package com.dorotajachtoma.eagleeye_licensing_service;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {


    @RequestMapping(value = "/{licenceId}",method = RequestMethod.GET)
    public License getLicenses(@PathVariable String organizationId, @PathVariable String licenceId){
        return new License(licenceId,"Teleco","Seat","TestOrg");
    }
}
