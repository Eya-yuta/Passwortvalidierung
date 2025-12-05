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
    void containsDigit() {
    }

    @org.junit.jupiter.api.Test
    void containsUpperAndLower() {
    }

    @org.junit.jupiter.api.Test
    void isCommonPassword() {
    }
}