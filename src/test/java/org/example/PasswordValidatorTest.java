package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordValidatorTest {

    @Test
    void returnTrue_ifPassword_hasMinLength_ofEight() {
        //GIVEN
        String password = "akdjjklk";
        int min_l=8;
        boolean expected=true;
        //WHEN
        boolean actual=PasswordValidator.hasMinLength(password, min_l);
        //THEN
        assertEquals(expected,actual);
    }
    @Test
    void returnTrue_ifPassword_hasLength_greaterThanMin() {
        assertTrue(PasswordValidator.hasMinLength("leo958hfn",8));
    }
    @Test
    void returnTrue_ifPassword_hasLength_smallerThanMin() {
        assertFalse(PasswordValidator.hasMinLength("leo95",8));
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


    @Test
    void test_returnTrue_ifContainsOnlyUpper() {
        assertFalse(PasswordValidator.containsUpperAndLower("ABCDEF"));
    }
    @Test
    void test_returnTrue_ifContainsOnlyLower() {
        assertFalse(PasswordValidator.containsUpperAndLower("abcdef"));
    }
    @Test
    void test_returnTrue_ifContainsUpperAndLower() {
        assertTrue(PasswordValidator.containsUpperAndLower("kdfhSHksd"));
    }
    @Test
    void test_returnTrue_ifContainsSingleLetter() {
        assertFalse(PasswordValidator.containsUpperAndLower("a"));
    }

    @Test
    void returnTrue_if_isCommonPassword() {
        assertTrue(PasswordValidator.isCommonPassword("12345678"));
    }

    @Test
    void returnTrue_if_isNotCommonPassword() {
        assertFalse(PasswordValidator.isCommonPassword("kdjntnsrhgfp6588DF"));
    }
    void returnTrue_if_isCommonPassword_UpperCase(){
        assertTrue(PasswordValidator.isCommonPassword("PASSWORD"));
    }
    void returnTrue_if_isCommonPassword_DifferentCase(){
        assertTrue(PasswordValidator.isCommonPassword("PASSword"));
    }

    @Test
    void test_returnTrue_ifAllRequirementsMet(){
        assertTrue(PasswordValidator.isValid("Abc#def1g"));
    }
    @Test
    void test_returnTrue_if_MinLengthFail(){
        assertFalse(PasswordValidator.isValid("Abc1def"));
    }
    @Test
    void test_returnTrue_if_NoDigit(){
        assertFalse(PasswordValidator.isValid("Abcdefgh"));
    }
    @Test
    void test_returnTrue_if_OnlyLowercase(){
        assertFalse(PasswordValidator.isValid("abcdefg1"));
    }
    @Test
    void test_returnTrue_if_OnlyUppercase(){
        assertFalse(PasswordValidator.isValid("ABCDEFG1"));
    }
    @Test
    void test_returnTrue_if_CommonPassword(){
        assertFalse(PasswordValidator.isValid("Passwort1"));
    }
    @Test
    void test_returnTrue_if_onlyDigitsAndLowercase(){
        assertFalse(PasswordValidator.isValid("lfkshmv87zhsmch"));
    }
    @Test
    void test_returnTrue_if_onlyDigitsAndUppercase(){
        assertFalse(PasswordValidator.isValid("KSJH8756JD7"));
    }
    @Test
    void test_returnTrue_if_commonPasswordMitSpaces(){
        assertFalse(PasswordValidator.isValid(" Passwort1 "));
    }
    @Test
    void test_returnTrue_if_VeryLongPassword(){
        String password = " Ab#cdef1g ";
        String longPw = "a".repeat(5000)+password;

        assertTrue(PasswordValidator.isValid(longPw));
    }

    @Test
    void test_returnTrue_if_ContainsOneSpecialChar(){
        String allowed = "!@#$%^&*()-_+=?.,;:";
        assertTrue(PasswordValidator.containsSpecialChar("Abcdef1g#",allowed));
    }
    @Test
    void test_returnTrue_if_ContainsManySpecialChar(){
        String allowed = "!@#$%^&*()-_+=?.,;:";
        assertTrue(PasswordValidator.containsSpecialChar("Ab%cd?ef1g#",allowed));
    }
    @Test
    void test_returnTrue_if_ContainsNoSpecialChar(){
        String allowed = "!@#$%^&*()-_+=?.,;:";
        assertFalse(PasswordValidator.containsSpecialChar("Abcdef1g",allowed));
    }
    @Test
    void test_returnTrue_if_ContainsSpecialChar_notInTheList(){
        String allowed = "!@#$%^&*()-_+=?.,;:";
        assertFalse(PasswordValidator.containsSpecialChar("Abcdef1g]",allowed));
    }




}