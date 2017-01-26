package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_98 {
    private final Production82_98 production = new Production82_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}