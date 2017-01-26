package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_165 {
    private final Production82_165 production = new Production82_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}