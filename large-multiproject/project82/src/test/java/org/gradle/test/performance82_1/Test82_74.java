package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_74 {
    private final Production82_74 production = new Production82_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}