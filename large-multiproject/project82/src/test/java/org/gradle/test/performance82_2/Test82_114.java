package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_114 {
    private final Production82_114 production = new Production82_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}