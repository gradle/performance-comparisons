package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_227 {
    private final Production82_227 production = new Production82_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}