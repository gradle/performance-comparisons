package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_350 {
    private final Production82_350 production = new Production82_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}