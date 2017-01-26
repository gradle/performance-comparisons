package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_424 {
    private final Production82_424 production = new Production82_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}