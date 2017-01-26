package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_403 {
    private final Production82_403 production = new Production82_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}