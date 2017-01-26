package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_463 {
    private final Production82_463 production = new Production82_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}