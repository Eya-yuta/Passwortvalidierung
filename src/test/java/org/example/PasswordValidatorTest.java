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
    void test_returnTrue_if_containsNoDigit() {
        //GIVEN
        String password = "kjuhzgtrdghj";
        boolean expected=false;
        //WHEN
        boolean actual=PasswordValidator.containsDigit(password);
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void test_returnTrue_if_containsOnlyOneDigit() {
        //GIVEN
        String password = "kjuhzg8trdghj";
        //WHEN
        boolean actual=PasswordValidator.containsDigit(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void test_returnTrue_if_containsManyDigits() {
        //GIVEN
        String password = "kj4uhzg8trd6ghj";
        //THEN
        assertTrue(PasswordValidator.containsDigit(password));
    }
    @Test
    void test_returnTrue_if_containsOnlyDigits() {
        assertTrue(PasswordValidator.containsDigit("938475652"));
    }
    @Test
    void test_returnTrue_if_containsOtherUnicodeDigits() {
        assertFalse(PasswordValidator.containsDigit("abc٣def"));
    }



    @org.junit.jupiter.api.Test
    void containsUpperAndLower() {
    }

    @org.junit.jupiter.api.Test
    void isCommonPassword() {
    }
}