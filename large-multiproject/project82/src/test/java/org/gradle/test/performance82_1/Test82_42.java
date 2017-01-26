package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_42 {
    private final Production82_42 production = new Production82_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}