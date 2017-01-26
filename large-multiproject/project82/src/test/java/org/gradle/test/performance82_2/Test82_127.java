package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_127 {
    private final Production82_127 production = new Production82_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}