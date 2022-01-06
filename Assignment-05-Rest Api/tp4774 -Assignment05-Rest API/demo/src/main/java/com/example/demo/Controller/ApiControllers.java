package com.example.demo.Controller;


import com.example.demo.Models.Book;
import com.example.demo.Models.User;
import com.example.demo.Repo.BookRepo;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private BookRepo bookRepo;

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/user") //get Users
    public List<User> getUsers(){

        return userRepo.findAll();
    }

    @GetMapping(value = "/book") //get Books
    public List<Book> getBooks(){

        return bookRepo.findAll();
    }

    @GetMapping(value = "/user/{id}")  //get a user
    public User getUser(@PathVariable long id){
        return  userRepo.findById(id).get();
    }

    @GetMapping(value = "/book/{id}")  //get a book
    public Book getBook(@PathVariable long id){
        return  bookRepo.findById(id).get();
    }

    @PostMapping(value = "/saveUser")  //save user
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved successfully!";
    }

    @PostMapping(value = "/saveBook") // save book
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Saved successfully!";
    }

    @PutMapping(value = "/updateUser/{id}")  //update user
    public String updateUser(@PathVariable long id, @RequestBody User user){

        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.setStreet(user.getStreet());
        updatedUser.setTown(user.getTown());
        updatedUser.setCountry(user.getCountry());
        updatedUser.setPhone(user.getPhone());
        updatedUser.setBirthDay(user.getBirthDay());
        updatedUser.setGender(user.getGender());
        userRepo.save(updatedUser);
        return "Updated successfully!";
    }

    @PutMapping(value = "/updateBook/{id}")  //update book
    public String updateBook(@PathVariable long id, @RequestBody Book book){

        Book updatedBook = bookRepo.findById(id).get();
        updatedBook.setTitle(book.getTitle());
        updatedBook.setSummary(book.getSummary());
        updatedBook.setPublishing(book.getPublishing());
        bookRepo.save(updatedBook);
        return "Updated successfully!";
    }

    @DeleteMapping(value = "/deleteUser/{id}")  //delete user
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted user with id: "+id;
    }

    @DeleteMapping(value = "/deleteBook/{id}")  //delete book
    public String deleteBook(@PathVariable long id){
        Book deleteBook = bookRepo.findById(id).get();
        bookRepo.delete(deleteBook);
        return "Deleted book with ISBN: "+id;
    }
}