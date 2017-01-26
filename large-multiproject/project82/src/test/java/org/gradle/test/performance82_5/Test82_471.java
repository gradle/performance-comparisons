package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_471 {
    private final Production82_471 production = new Production82_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}