package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_91 {
    private final Production82_91 production = new Production82_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}