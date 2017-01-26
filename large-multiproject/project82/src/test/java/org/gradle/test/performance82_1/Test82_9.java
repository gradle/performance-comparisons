package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_9 {
    private final Production82_9 production = new Production82_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}