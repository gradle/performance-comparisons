package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_25 {
    private final Production82_25 production = new Production82_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}