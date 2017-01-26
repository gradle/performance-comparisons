package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_287 {
    private final Production82_287 production = new Production82_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}