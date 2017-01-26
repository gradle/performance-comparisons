package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_341 {
    private final Production82_341 production = new Production82_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}