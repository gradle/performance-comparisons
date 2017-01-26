package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_105 {
    private final Production82_105 production = new Production82_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}