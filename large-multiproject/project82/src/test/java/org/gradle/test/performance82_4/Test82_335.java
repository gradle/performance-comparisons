package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_335 {
    private final Production82_335 production = new Production82_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}