package com.example.demo.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path="api/userlogin")
public class LibraryController {

    private final LibraryService libraryService;
    private final ValidateService validateService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    @Autowired
    public libraryController(ValidateService validateService)
    {
        this.validateService =validateService;
    }

    @GetMapping("/view")
    public List<LibraryUser> getUsers() {
        return libraryService.getUsers();
    }

    @PostMapping("/add")

    public ResponseEntity<String> registerNewUser(@RequestBody LibraryUser libraryUser) {
        if (libraryService.addNewUser(libraryUser) == 0) {
            return new ResponseEntity<>("Email ID exists, Try another one", HttpStatus.OK);
            //return "Email ID exists, Try another one";
        }
        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
        //return "User registered successfully";
    }

    @PostMapping("/validate")
    public ResponseEntity<String> checkUser(@RequestBody LibraryUser libraryUser) {
        if (validateService.validateUser(libraryUser) == 0) {
            return new ResponseEntity<>("Invalid credentials", HttpStatus.OK);
        }
        return new ResponseEntity<>("Welcome", HttpStatus.OK);
    }
}