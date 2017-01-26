package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_258 {
    private final Production82_258 production = new Production82_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}