package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_342 {
    private final Production82_342 production = new Production82_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}