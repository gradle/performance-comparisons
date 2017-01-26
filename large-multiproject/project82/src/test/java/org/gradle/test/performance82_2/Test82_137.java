package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_137 {
    private final Production82_137 production = new Production82_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}