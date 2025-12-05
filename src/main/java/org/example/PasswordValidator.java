package org.example;

import java.util.Set;

public final class PasswordValidator {

        public static boolean hasMinLength(String password, int min) {
            if(password==null || password.isBlank()) {
                return false;
            }
            int len = password.length();
            return len >= min;
        }

        public static boolean containsDigit(String password) {
            if(password==null || password.isBlank()) {
                return false;
            }
            boolean isDigit=false;
            for(int i=0;i<password.length();i++) {
                char c=password.charAt(i);
                if(c>='0' && c<='9') {
                    isDigit=true;
                    break;
                }
            }
            return isDigit;
        }

        public static boolean containsUpperAndLower(String password) {
            if (password==null || password.isBlank()) {
                return false;
            }
            boolean isUpper=false;
            boolean isLower=false;
            for(int i=0;i<password.length();i++) {
                char c=password.charAt(i);
                if(c>='A' && c<='Z') {
                    isUpper=true;
                }
                if(c>='a' && c<='z') {
                    isLower=true;
                }
                if (isUpper && isLower) break;
            }
            return isUpper && isLower;
        }
        // --- Static internal list  ---
        private static final Set<String> common_passwords = Set.of(
            "password",
            "passwort1",
            "12345678",
            "aa345678");

        public static boolean isCommonPassword(String password) {
            if(password==null || password.isBlank()) {
                return false;
            }

            boolean isCommon=false;

            for (String commonPassword : common_passwords) {
                if (password.trim().equals(commonPassword) || password.trim().toLowerCase().equals(commonPassword)) {
                    isCommon = true;
                    break;
                }
            }
            return isCommon;

        }

        // Bonus:

        public static boolean containsSpecialChar(String password, String allowed) {
            if(password==null || password.isBlank()) {
                return false;
            }
            boolean isSpecialChar=false;
            for(int i=0;i<password.length();i++) {
                char c=password.charAt(i);
                for(int j=0;j<allowed.length();j++) {
                    if(c==allowed.charAt(j)) {
                        isSpecialChar=true;
                        break;
                    }
                }
            }
            return isSpecialChar;
        }

        // Validation:
        public static boolean isValid(String password) {
            if (password==null || password.isBlank()) {
                return false;
            }
            return hasMinLength(password, 8) && containsDigit(password) && containsUpperAndLower(password) && !isCommonPassword(password);

        }

}
