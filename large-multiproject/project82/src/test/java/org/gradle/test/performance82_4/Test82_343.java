package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_343 {
    private final Production82_343 production = new Production82_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}