package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_443 {
    private final Production82_443 production = new Production82_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}