package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_173 {
    private final Production82_173 production = new Production82_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}