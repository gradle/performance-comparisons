package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_156 {
    private final Production82_156 production = new Production82_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}