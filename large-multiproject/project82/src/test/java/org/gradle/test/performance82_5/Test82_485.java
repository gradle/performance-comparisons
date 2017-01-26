package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_485 {
    private final Production82_485 production = new Production82_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}