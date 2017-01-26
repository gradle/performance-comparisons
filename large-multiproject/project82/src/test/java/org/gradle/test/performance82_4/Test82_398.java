package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_398 {
    private final Production82_398 production = new Production82_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}