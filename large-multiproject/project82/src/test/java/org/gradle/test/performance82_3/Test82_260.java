package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_260 {
    private final Production82_260 production = new Production82_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}