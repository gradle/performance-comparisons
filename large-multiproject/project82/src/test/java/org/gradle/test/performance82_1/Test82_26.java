package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_26 {
    private final Production82_26 production = new Production82_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}