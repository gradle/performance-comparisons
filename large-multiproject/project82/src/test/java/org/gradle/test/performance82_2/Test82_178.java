package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_178 {
    private final Production82_178 production = new Production82_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}