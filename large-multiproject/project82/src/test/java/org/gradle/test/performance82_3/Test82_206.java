package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_206 {
    private final Production82_206 production = new Production82_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}