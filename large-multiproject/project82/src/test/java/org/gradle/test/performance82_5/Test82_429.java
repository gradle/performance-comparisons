package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_429 {
    private final Production82_429 production = new Production82_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}