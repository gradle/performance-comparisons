package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_65 {
    private final Production82_65 production = new Production82_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}