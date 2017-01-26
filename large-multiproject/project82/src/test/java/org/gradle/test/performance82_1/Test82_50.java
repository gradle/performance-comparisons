package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_50 {
    private final Production82_50 production = new Production82_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}