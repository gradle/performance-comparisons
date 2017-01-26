package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_437 {
    private final Production82_437 production = new Production82_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}