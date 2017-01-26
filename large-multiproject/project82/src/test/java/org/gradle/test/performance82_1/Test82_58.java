package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_58 {
    private final Production82_58 production = new Production82_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}