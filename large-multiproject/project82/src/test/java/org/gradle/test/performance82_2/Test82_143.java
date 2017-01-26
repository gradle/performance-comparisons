package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_143 {
    private final Production82_143 production = new Production82_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}