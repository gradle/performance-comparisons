package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_414 {
    private final Production82_414 production = new Production82_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}