package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_396 {
    private final Production82_396 production = new Production82_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}