package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestSavaHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		HospitalService service = new HospitalService();
		hospital.setName("KIMS");
		hospital.setWebsite("ww.kims/koppal.com");
		service.savaHospital(hospital);
	}
}
