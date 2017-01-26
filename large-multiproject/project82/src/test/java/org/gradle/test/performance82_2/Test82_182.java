package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_182 {
    private final Production82_182 production = new Production82_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}