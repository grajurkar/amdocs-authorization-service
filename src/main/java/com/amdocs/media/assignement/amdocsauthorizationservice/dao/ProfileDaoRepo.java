package com.amdocs.media.assignement.amdocsauthorizationservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.media.assignement.amdocsauthorizationservice.model.DAOProfile;

@Repository
public interface ProfileDaoRepo extends CrudRepository<DAOProfile, Integer> {

	DAOProfile findByUsername(String username);

//	DAOProfile saveDaoProfile(String user);

	@Override
	DAOProfile save(DAOProfile user);

}