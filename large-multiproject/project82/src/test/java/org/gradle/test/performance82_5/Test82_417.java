package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_417 {
    private final Production82_417 production = new Production82_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}