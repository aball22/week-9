package org.example.week9.d4.e3;

public class SecuritySystem {
    private void authenticate() {
        System.out.println("Authenticating with password");
    }
    private void authenticate(int otp) {
        System.out.println("Authenticating with OTP: " + otp);
    }
    public void performAuthentication(Integer otp) {

        if (otp == null) {
            authenticate();
        }else {
            authenticate(otp);
        }
    }
}
