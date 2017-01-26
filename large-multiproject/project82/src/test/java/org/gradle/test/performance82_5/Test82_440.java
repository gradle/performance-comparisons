package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_440 {
    private final Production82_440 production = new Production82_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}