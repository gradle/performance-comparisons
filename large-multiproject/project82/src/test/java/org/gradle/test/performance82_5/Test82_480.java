package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_480 {
    private final Production82_480 production = new Production82_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}