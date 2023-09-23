package com.example.demo.Library;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(path="processdata")
public class Backened {
   // private final LibraryUser libraryUser;
    private final LibraryService libraryService;

    public Backened(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
/*@PostMapping("/process")
    public ResponseEntity<String> addUser(@RequestBody LibraryUser libraryUser)
{
    if(libraryService.addNewUser(libraryUser))
    {
        return new ResponseEntity<> ("User saved", HttpStatus.OK);
}
   public Backened(LibraryUser libraryUser) {
        this.libraryUser = libraryUser;
         } */

   /* @PostMapping("process")
    public String processUserData(@RequestBody UserData userData)
    {
      if(email==libraryUser.getEmail()&&password==libraryUser.getPassword())
      {
          return "Valid User";
      }
    }*/
}
