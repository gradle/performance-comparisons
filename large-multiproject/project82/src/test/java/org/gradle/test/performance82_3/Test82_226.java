package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_226 {
    private final Production82_226 production = new Production82_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}