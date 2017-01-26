package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_1 {
    private final Production82_1 production = new Production82_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}