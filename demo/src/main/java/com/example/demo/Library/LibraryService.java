package com.example.demo.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
    public class LibraryService {
    Optional<LibraryUser> libraryUserOptional=Optional.empty();
    private final LibraryRepository libraryRepository;
    @Autowired
    public LibraryService(LibraryRepository libraryRepository)
    {
         this.libraryRepository = libraryRepository;
    }

    public List<LibraryUser> getUsers()
    {
        return libraryRepository.findAll();
    }

    public int addNewUser(LibraryUser libraryUser) {

        libraryUserOptional = libraryRepository.findUserByEmail(libraryUser.getEmail());

        if (libraryUserOptional.isPresent()) {

            return 0;
        }
        libraryRepository.save(libraryUser);
       return 1;

    }


}

