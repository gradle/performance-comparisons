package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_312 {
    private final Production82_312 production = new Production82_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}