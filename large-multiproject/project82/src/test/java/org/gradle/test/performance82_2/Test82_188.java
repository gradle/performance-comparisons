package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_188 {
    private final Production82_188 production = new Production82_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}