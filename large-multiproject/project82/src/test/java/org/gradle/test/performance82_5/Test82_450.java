package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_450 {
    private final Production82_450 production = new Production82_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}