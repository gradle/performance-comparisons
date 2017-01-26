package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_459 {
    private final Production82_459 production = new Production82_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}