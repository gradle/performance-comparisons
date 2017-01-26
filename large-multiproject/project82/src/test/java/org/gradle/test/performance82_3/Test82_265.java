package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_265 {
    private final Production82_265 production = new Production82_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}