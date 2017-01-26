package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_381 {
    private final Production82_381 production = new Production82_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}