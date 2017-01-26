package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_441 {
    private final Production82_441 production = new Production82_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}