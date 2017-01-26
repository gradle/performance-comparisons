package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_490 {
    private final Production82_490 production = new Production82_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}