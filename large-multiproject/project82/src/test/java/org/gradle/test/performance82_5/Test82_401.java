package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_401 {
    private final Production82_401 production = new Production82_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}