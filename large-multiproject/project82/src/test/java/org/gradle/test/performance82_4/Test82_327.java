package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_327 {
    private final Production82_327 production = new Production82_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}