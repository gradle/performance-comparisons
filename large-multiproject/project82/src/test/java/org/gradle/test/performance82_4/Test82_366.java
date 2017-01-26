package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_366 {
    private final Production82_366 production = new Production82_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}