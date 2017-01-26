package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_228 {
    private final Production82_228 production = new Production82_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}