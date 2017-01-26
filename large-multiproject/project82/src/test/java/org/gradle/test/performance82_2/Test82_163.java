package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_163 {
    private final Production82_163 production = new Production82_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}