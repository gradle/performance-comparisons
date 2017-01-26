package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_78 {
    private final Production82_78 production = new Production82_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}