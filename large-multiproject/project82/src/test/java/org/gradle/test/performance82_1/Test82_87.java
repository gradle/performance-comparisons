package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_87 {
    private final Production82_87 production = new Production82_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}