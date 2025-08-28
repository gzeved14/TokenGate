package com.example.tokengate.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository
        extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByEmail(String Email);

    @Transactional
    @Modifying
    @Query("Update AppUser a SET a.enabled = TRUE WHERE a.email = ?1")
    int enableAppUser(String email);
}
