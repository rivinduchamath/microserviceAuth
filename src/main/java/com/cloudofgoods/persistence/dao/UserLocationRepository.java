package com.cloudofgoods.persistence.dao;

import com.cloudofgoods.persistence.model.User;
import com.cloudofgoods.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
