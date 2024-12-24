package com.piysati.lms.repository;

import com.piysati.lms.entity.MemberUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibraryUserRepository extends JpaRepository<MemberUser, Short> {
    // it will have all the default methods, we only need to add custom methods
}
