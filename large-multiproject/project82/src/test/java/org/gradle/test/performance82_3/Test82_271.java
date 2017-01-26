package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_271 {
    private final Production82_271 production = new Production82_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}