package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_266 {
    private final Production82_266 production = new Production82_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}