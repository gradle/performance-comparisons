package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_4 {
    private final Production82_4 production = new Production82_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}