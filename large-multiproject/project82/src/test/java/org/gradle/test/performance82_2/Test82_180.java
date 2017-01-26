package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_180 {
    private final Production82_180 production = new Production82_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}