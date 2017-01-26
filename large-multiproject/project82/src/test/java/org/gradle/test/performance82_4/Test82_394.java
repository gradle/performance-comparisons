package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_394 {
    private final Production82_394 production = new Production82_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}