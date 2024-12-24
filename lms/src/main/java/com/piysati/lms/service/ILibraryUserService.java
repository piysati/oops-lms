package com.piysati.lms.service;

import com.piysati.lms.dto.RegisterDTO;
import com.piysati.lms.entity.MemberUser;

import java.util.List;

public interface ILibraryUserService {
    MemberUser addUser(RegisterDTO registerDTO);
    MemberUser getUSer(short id);
    List<MemberUser> getAllUsers();
    MemberUser updateUser(short id, RegisterDTO registerDTO);
    void deleteUser(short id);
}
