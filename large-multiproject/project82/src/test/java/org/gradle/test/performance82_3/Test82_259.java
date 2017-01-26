package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_259 {
    private final Production82_259 production = new Production82_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}