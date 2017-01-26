package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_311 {
    private final Production82_311 production = new Production82_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}