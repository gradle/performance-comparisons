package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_140 {
    private final Production82_140 production = new Production82_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}