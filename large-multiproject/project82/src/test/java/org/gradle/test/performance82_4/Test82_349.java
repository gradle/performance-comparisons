package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_349 {
    private final Production82_349 production = new Production82_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}