package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_138 {
    private final Production82_138 production = new Production82_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}