package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_310 {
    private final Production82_310 production = new Production82_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}