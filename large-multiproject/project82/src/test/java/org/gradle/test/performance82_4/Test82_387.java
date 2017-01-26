package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_387 {
    private final Production82_387 production = new Production82_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}