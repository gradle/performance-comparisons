package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_242 {
    private final Production82_242 production = new Production82_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}