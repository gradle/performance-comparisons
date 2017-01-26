package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_63 {
    private final Production82_63 production = new Production82_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}