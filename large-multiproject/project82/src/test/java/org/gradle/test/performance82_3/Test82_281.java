package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_281 {
    private final Production82_281 production = new Production82_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}