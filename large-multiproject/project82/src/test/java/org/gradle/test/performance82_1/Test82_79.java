package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_79 {
    private final Production82_79 production = new Production82_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}