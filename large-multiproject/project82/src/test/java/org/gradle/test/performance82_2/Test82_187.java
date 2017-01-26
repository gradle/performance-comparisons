package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_187 {
    private final Production82_187 production = new Production82_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}