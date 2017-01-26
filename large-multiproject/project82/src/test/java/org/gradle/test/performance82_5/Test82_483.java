package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_483 {
    private final Production82_483 production = new Production82_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}