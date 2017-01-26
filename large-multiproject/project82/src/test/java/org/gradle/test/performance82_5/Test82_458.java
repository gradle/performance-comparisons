package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_458 {
    private final Production82_458 production = new Production82_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}