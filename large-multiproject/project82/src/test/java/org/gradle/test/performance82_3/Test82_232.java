package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_232 {
    private final Production82_232 production = new Production82_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}