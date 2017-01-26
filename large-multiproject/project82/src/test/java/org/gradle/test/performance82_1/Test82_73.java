package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_73 {
    private final Production82_73 production = new Production82_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}