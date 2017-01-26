package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_421 {
    private final Production82_421 production = new Production82_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}