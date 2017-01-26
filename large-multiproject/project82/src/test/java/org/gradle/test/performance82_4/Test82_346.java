package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_346 {
    private final Production82_346 production = new Production82_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}