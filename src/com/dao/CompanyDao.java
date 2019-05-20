package com.dao;

import com.entity.Company;

public interface CompanyDao {
int updateCompany(Company com);
	
	Company queryCompany();
}
