package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_464 {
    private final Production82_464 production = new Production82_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}