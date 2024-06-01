package com.znaji.springevents.controller;

import com.znaji.springevents.dto.PatientDischargeRequest;
import com.znaji.springevents.service.PatientDischargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PatientDischargeController {

    private final PatientDischargeService patientDischargeService;

    @GetMapping("/discharge")
    public String dischargePatient(@RequestBody PatientDischargeRequest request) {
        System.out.printf("----> start discharging patient %s, handled by thread %s%n", request.getPatientName(), Thread.currentThread().getName());

        patientDischargeService.dischargePatient(request.getPatientName(), request.getPatientId());

        System.out.printf("----> discharging patient %s completed, handled by thread %s%n", request.getPatientName(), Thread.currentThread().getName());
        return "Patient discharged";
    }
}
