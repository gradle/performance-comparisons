package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_38 {
    private final Production82_38 production = new Production82_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}