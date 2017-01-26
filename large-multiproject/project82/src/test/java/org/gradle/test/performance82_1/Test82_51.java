package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_51 {
    private final Production82_51 production = new Production82_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}