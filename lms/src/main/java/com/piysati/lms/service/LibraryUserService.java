package com.piysati.lms.service;

import com.piysati.lms.dto.RegisterDTO;
import com.piysati.lms.entity.MemberUser;
import com.piysati.lms.repository.ILibraryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryUserService implements ILibraryUserService {

    @Autowired
    private ILibraryUserRepository iLibraryUserRepository;

    @Override
    public MemberUser addUser(RegisterDTO registerDTO) {
        MemberUser memberUser = new MemberUser();
        memberUser.setName(registerDTO.getName());
        memberUser.setEmail(registerDTO.getEmail());
        memberUser.setPhoneNumber(registerDTO.getPhoneNumber());
        return this.iLibraryUserRepository.save(memberUser);
    }

    @Override
    public MemberUser getUSer(short id) {
        return this.iLibraryUserRepository.getReferenceById(id);
    }

    @Override
    public List<MemberUser> getAllUsers() {
        return this.iLibraryUserRepository.findAll();
    }

    @Override
    public MemberUser updateUser(short id, RegisterDTO registerDTO) {
        MemberUser memberUser = this.getUSer(id);
        memberUser.setName(registerDTO.getName());
        memberUser.setEmail(registerDTO.getEmail());
        memberUser.setPhoneNumber(registerDTO.getPhoneNumber());
        return this.iLibraryUserRepository.save(memberUser);
    }

    @Override
    public void deleteUser(short id) {
        this.iLibraryUserRepository.deleteById(id);
    }
}
