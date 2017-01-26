package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_169 {
    private final Production82_169 production = new Production82_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}