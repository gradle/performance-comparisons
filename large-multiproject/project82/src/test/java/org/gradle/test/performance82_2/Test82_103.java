package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_103 {
    private final Production82_103 production = new Production82_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}