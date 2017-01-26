package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_13 {
    private final Production82_13 production = new Production82_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}