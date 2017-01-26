package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_56 {
    private final Production82_56 production = new Production82_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}