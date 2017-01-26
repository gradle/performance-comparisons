package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_484 {
    private final Production82_484 production = new Production82_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}