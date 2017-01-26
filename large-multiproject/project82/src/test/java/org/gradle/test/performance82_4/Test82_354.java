package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_354 {
    private final Production82_354 production = new Production82_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}