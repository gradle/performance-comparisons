package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_275 {
    private final Production82_275 production = new Production82_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}