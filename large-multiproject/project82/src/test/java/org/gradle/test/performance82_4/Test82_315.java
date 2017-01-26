package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_315 {
    private final Production82_315 production = new Production82_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}