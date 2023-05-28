package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class UpdateHospital {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		HospitalService service = new HospitalService();
		Hospital hospital1 = service.updataHospitalById(1, hospital);
		hospital1.setName("BIMS");
		hospital1.setWebsite("www.Bims.com");
	}
}
 