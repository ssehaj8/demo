package com.cg.MultiPageAssigment.Controller;
import com.cg.MultiPageAssigment.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")  // Keep user object alive across pages
public class UserController {

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    // Show Page 1 - First Name and Last Name Form
    @GetMapping("/")
    public String showPage1() {
        return "page1";  // it will load page1.html
    }

    // Process Page 1 form and move to Page 2
    @PostMapping("/page2")
    public String processPage1(@ModelAttribute("user") User user,
                               @RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) {
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return "page2";  // go to page2.html
    }
    // Process Page 2 form and move to Page 3

    @PostMapping("/page3")
    public String processPage2(@ModelAttribute("user") User user,
                               @RequestParam("email") String email,
                               @RequestParam("phone") String phone) {
        user.setEmail(email);
        user.setPhone(phone);
        return "page3"; // move to page3.html
    }

    // Process Page 3 form and move to Page 4
    @PostMapping("/page4")
    public String processPage3(@ModelAttribute("user") User user,
                               @RequestParam("city") String city,
                               @RequestParam("country") String country) {
        user.setCity(city);
        user.setCountry(country);
        return "page4";  // move to page4.html
    }


}


