package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_118 {
    private final Production82_118 production = new Production82_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}