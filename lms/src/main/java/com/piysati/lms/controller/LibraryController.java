package com.piysati.lms.controller;

import com.piysati.lms.dto.RegisterDTO;
import com.piysati.lms.entity.MemberUser;
import com.piysati.lms.service.LibraryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    @Autowired
    private LibraryUserService libraryService;

    @PostMapping("/users")
    public ResponseEntity<MemberUser> addUSer(@RequestBody RegisterDTO registerdto){
        return ResponseEntity.ok(this.libraryService.addUser(registerdto));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<MemberUser> getUSer(@PathVariable short id){
        return ResponseEntity.ok(this.libraryService.getUSer(id));
    }

    @GetMapping("/users")
    public ResponseEntity<List<MemberUser>> getAllUsers(){
        return ResponseEntity.ok(this.libraryService.getAllUsers());
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<MemberUser> getUSer(@PathVariable short id, @RequestBody RegisterDTO registerdto){
        return ResponseEntity.ok(this.libraryService.updateUser(id, registerdto));
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable short id){
        this.libraryService.deleteUser(id);
        return new ResponseEntity("User Deleted", HttpStatus.OK);
    }
}
