package com.PanicStatus.API;

class PanicStatusNotFoundException extends RuntimeException {
    PanicStatusNotFoundException() {
        super("Could not find status");
    }
}