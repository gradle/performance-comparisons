package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_148 {
    private final Production82_148 production = new Production82_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}