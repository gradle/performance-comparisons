package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_319 {
    private final Production82_319 production = new Production82_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}