package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_61 {
    private final Production82_61 production = new Production82_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}