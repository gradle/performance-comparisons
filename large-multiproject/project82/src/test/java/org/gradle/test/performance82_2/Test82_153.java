package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_153 {
    private final Production82_153 production = new Production82_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}