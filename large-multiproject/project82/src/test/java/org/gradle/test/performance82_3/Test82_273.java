package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_273 {
    private final Production82_273 production = new Production82_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}