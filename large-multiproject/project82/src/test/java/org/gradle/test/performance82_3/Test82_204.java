package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_204 {
    private final Production82_204 production = new Production82_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}