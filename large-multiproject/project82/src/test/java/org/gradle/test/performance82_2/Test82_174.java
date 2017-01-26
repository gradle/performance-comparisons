package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_174 {
    private final Production82_174 production = new Production82_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}