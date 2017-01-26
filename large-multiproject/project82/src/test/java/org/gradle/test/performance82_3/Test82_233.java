package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_233 {
    private final Production82_233 production = new Production82_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}