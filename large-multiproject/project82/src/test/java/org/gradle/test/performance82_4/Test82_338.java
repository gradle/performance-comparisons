package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_338 {
    private final Production82_338 production = new Production82_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}