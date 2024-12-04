package org.example.week9.d4.e3;

public class E3MethodOverloading {


    public static void main(String[] args){

        SecuritySystem obj = new SecuritySystem();
        obj.performAuthentication(null);
        obj.performAuthentication(123456);

        // Step 1: Create a `SecuritySystem` class and Declare two overloaded private methods authenticate
        // One method authenticate() with no parameters and prints "Authenticating with password"
        // Another method authenticate(int otp) with OTP as parameter and prints "Authenticating with OTP: " followed by the OTP value
        // Create a public method performAuthentication() and Call the private authenticate() method (password-based authentication).
        // and private authenticate(int otp) method (OTP-based authentication) with an example OTP value (e.g., 123456).
        // Step 2: In the main class, create a `SecuritySystem ` object, call `performAuthentication` that executes both types of authentication.

    }

}
