package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_104 {
    private final Production82_104 production = new Production82_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}