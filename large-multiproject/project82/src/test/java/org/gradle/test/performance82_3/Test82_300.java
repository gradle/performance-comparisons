package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_300 {
    private final Production82_300 production = new Production82_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}