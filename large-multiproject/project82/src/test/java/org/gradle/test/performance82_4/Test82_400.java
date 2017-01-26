package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_400 {
    private final Production82_400 production = new Production82_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}