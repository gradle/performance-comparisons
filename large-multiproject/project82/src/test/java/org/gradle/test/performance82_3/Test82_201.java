package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_201 {
    private final Production82_201 production = new Production82_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}