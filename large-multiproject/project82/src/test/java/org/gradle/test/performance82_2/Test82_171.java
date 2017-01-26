package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_171 {
    private final Production82_171 production = new Production82_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}