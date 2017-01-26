package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_389 {
    private final Production82_389 production = new Production82_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}