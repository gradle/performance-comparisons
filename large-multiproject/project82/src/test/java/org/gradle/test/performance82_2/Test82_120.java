package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_120 {
    private final Production82_120 production = new Production82_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}