package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_11 {
    private final Production82_11 production = new Production82_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}