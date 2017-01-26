package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_22 {
    private final Production82_22 production = new Production82_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}