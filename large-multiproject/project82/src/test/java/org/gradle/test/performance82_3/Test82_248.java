package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_248 {
    private final Production82_248 production = new Production82_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}