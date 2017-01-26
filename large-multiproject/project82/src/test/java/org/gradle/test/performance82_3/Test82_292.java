package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_292 {
    private final Production82_292 production = new Production82_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}