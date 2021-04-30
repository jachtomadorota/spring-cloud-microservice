package com.dorotajachtoma.eagleeye_licensing_service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations.{organizationId}/licenses")
public class LicenseServiceController {
}
