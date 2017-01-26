package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_457 {
    private final Production82_457 production = new Production82_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}