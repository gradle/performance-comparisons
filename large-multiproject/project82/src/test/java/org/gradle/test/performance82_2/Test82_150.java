package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_150 {
    private final Production82_150 production = new Production82_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}