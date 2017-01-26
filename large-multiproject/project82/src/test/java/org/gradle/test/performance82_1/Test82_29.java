package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_29 {
    private final Production82_29 production = new Production82_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}