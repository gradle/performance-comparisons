package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_193 {
    private final Production82_193 production = new Production82_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}