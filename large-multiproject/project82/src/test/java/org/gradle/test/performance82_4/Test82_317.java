package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_317 {
    private final Production82_317 production = new Production82_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}