package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_336 {
    private final Production82_336 production = new Production82_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}