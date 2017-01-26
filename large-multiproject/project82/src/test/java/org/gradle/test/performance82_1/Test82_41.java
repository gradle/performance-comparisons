package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_41 {
    private final Production82_41 production = new Production82_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}