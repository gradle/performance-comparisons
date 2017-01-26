package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_348 {
    private final Production82_348 production = new Production82_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}