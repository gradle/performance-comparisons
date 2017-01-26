package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_448 {
    private final Production82_448 production = new Production82_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}