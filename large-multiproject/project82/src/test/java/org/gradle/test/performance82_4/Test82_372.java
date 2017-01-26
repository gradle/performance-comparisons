package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_372 {
    private final Production82_372 production = new Production82_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}