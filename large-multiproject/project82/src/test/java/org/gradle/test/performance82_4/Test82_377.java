package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_377 {
    private final Production82_377 production = new Production82_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}