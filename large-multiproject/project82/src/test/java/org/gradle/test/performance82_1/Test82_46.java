package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_46 {
    private final Production82_46 production = new Production82_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}