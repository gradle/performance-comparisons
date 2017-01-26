package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_359 {
    private final Production82_359 production = new Production82_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}