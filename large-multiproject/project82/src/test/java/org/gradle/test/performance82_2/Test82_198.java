package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_198 {
    private final Production82_198 production = new Production82_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}