package com.wallet.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.entities.Login;

public interface WalletRepository extends JpaRepository<Login,Long> {

}
