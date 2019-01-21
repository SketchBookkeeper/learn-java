package com.company;

// Practice is to start interface name with uppercase I
public interface ITelephone {
    // Signature
    // Interfaces are a contract that these
    // fields and methods will be available in
    // classes that implement the interface.
    void powerOn();
    void  dial(int phoneNumber);
    boolean isRinging();
}
