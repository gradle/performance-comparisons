package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_345 {
    private final Production82_345 production = new Production82_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}