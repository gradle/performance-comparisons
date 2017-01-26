package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_290 {
    private final Production82_290 production = new Production82_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}