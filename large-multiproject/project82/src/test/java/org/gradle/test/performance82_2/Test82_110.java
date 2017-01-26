package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_110 {
    private final Production82_110 production = new Production82_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}