package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_190 {
    private final Production82_190 production = new Production82_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}