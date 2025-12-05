package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordValidatorTest {

    @Test
    void returnTrue_ifPassword_hasMinLength() {
        //GIVEN
        String password = "akdjjkljk";
        int min_l=8;
        boolean expected=true;
        //WHEN
        boolean actual=PasswordValidator.hasMinLength(password, min_l);
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void returnTrue_ifPassword_Null() {
        //GIVEN
        String password = null;
        int min_l=8;
        boolean expected=false;
        //WHEN
        boolean actual=PasswordValidator.hasMinLength(password, min_l);
        //GIVEN
        assertEquals(expected,actual);
    }

    @Test
    void returnTrue_ifPassword_blank() {
        //GIVEN
        String password = "         ";
        int min_l=8;
        boolean expected=false;
        //WHEN
        boolean actual=PasswordValidator.hasMinLength(password, min_l);
        //GIVEN
        assertEquals(expected,actual);
    }

    @Test
    void returnTrue_if_containsNoDigit() {
        //GIVEN
        String password = "kjuhzgtrdghj";
        boolean expected=false;
        //WHEN
        boolean actual=PasswordValidator.containsDigit(password);
        //THEN
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void containsUpperAndLower() {
    }

    @org.junit.jupiter.api.Test
    void isCommonPassword() {
    }
}