package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_262 {
    private final Production82_262 production = new Production82_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}