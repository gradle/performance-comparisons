package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_428 {
    private final Production82_428 production = new Production82_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}