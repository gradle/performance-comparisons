package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_347 {
    private final Production82_347 production = new Production82_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}