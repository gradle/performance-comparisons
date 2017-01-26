package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_263 {
    private final Production82_263 production = new Production82_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}