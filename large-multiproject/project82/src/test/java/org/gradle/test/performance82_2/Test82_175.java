package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_175 {
    private final Production82_175 production = new Production82_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}