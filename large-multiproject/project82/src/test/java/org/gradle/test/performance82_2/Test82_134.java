package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_134 {
    private final Production82_134 production = new Production82_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}