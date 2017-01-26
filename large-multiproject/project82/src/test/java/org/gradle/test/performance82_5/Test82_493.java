package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_493 {
    private final Production82_493 production = new Production82_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}