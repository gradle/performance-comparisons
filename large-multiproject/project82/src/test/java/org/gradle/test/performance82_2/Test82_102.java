package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_102 {
    private final Production82_102 production = new Production82_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}