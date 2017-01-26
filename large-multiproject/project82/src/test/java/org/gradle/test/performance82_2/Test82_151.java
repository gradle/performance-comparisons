package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_151 {
    private final Production82_151 production = new Production82_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}