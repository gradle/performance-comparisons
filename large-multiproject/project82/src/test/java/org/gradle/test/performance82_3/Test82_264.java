package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_264 {
    private final Production82_264 production = new Production82_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}