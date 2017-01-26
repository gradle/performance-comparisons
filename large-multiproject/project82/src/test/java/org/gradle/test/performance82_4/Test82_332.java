package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_332 {
    private final Production82_332 production = new Production82_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}