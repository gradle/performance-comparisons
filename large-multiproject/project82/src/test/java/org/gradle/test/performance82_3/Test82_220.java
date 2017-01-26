package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_220 {
    private final Production82_220 production = new Production82_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}