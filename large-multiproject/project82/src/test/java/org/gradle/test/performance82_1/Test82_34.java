package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_34 {
    private final Production82_34 production = new Production82_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}