package com.componente.factinven.importers;

import org.springframework.web.multipart.MultipartFile;


public interface ImporterExcelInterface {
	
	void LeerExcel(MultipartFile file);

}
