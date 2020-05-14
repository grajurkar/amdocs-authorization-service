package com.amdocs.media.assignement.amdocsauthorizationservice.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.media.assignement.amdocsauthorizationservice.dao.ProfileDaoRepo;
import com.amdocs.media.assignement.amdocsauthorizationservice.dao.UserDao;
import com.amdocs.media.assignement.amdocsauthorizationservice.model.DAOProfile;
import com.amdocs.media.assignement.exception.UserNotFoundException;

@RestController
public class MainController {

	@Autowired

	private ProfileDaoRepo profileDaorepo;
	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/profiles", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@Valid @RequestBody DAOProfile user /* , @PathParam("userr") String username */)
			throws Exception {
//		DAOUser usercheck = userDao.findByUsername(username);
//		if (username.equalsIgnoreCase(usercheck.getUsername())) {
//
//			return ResponseEntity.ok(profileDao.save(user));
//		}
		return ResponseEntity.ok(profileDaorepo.save(user));
	}

	@RequestMapping(value = "/profiles/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateUser(@Valid @RequestBody DAOProfile user, @PathVariable("id") int id)
			throws Exception {

		Optional<DAOProfile> entity = profileDaorepo.findById(id);

//		DAOUser usercheck = userDao.findByUsername(username);
//		if (username.equalsIgnoreCase(usercheck.getUsername())) {
//
//			return ResponseEntity.ok(profileDao.save(user));
//		}
		return ResponseEntity.ok(profileDaorepo.save(user));
	}

//	@PutMapping("/posts/{id}")
//	public String postData(String username) {
//
//		DAOUser user = userDao.findByUsername(username);
//		return "Post data valid";
//
//	}

	/// delete by username
	@RequestMapping(value = "/profiles/{username}", method = RequestMethod.DELETE)
	public ResponseEntity deleteUser(@PathVariable("username") String username) throws Exception {
//		DAOUser usercheck = userDao.findByUsername(username);
		DAOProfile entity = profileDaorepo.findByUsername(username);
		String uname = entity.getUsername();
		int uid = entity.getId();
		if (!uname.equalsIgnoreCase(username))
//defining customized exception here

			throw new UserNotFoundException("username-" + username);

		profileDaorepo.deleteById(uid);

//		if (username.equalsIgnoreCase(usercheck.getUsername())) {
//
//			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
////			return ResponseEntity.ok(profileDao.save(user));
//
////		return ResponseEntity.ok(profileDaorepo.delete(DAOProfile user));
//		}
		return ResponseEntity.ok(HttpStatus.NO_CONTENT);
	}
}