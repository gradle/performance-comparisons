package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_420 {
    private final Production82_420 production = new Production82_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}