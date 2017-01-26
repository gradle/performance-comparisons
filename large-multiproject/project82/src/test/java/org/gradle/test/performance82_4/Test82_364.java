package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_364 {
    private final Production82_364 production = new Production82_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}