package org.example;

public final class PasswordValidator {

        public static boolean hasMinLength(String password, int min) {
            if(password==null || password.isBlank()) {
                return false;
            }
            int len = password.length();
            return len >= min;
        }

        /*public static boolean containsDigit(String password) {
            // TODO: implement
        }

        public static boolean containsUpperAndLower(String password) {
            // TODO: implement
        }

        public static boolean isCommonPassword(String password) {
            // TODO: implement
        }

        // Bonus:
        public static boolean containsSpecialChar(String password, String allowed) {
            // TODO: implement
        }

        // Optional:
        public static boolean isValid(String password) {
            // TODO: call the other methods
        }*/

}
