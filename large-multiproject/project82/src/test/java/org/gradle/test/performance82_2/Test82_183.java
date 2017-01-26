package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_183 {
    private final Production82_183 production = new Production82_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}