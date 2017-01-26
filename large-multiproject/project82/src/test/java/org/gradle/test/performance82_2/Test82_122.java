package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_122 {
    private final Production82_122 production = new Production82_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}