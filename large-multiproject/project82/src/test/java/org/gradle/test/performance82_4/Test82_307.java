package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_307 {
    private final Production82_307 production = new Production82_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}