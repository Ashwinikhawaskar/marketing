package com.wallet.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.entities.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
