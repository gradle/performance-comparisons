package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_497 {
    private final Production82_497 production = new Production82_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}