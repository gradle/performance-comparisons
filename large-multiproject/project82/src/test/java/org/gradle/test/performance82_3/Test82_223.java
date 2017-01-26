package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_223 {
    private final Production82_223 production = new Production82_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}