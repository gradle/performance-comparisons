package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_113 {
    private final Production82_113 production = new Production82_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}