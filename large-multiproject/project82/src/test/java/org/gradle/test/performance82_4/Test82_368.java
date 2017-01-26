package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_368 {
    private final Production82_368 production = new Production82_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}