package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_199 {
    private final Production82_199 production = new Production82_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}