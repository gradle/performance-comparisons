package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_40 {
    private final Production82_40 production = new Production82_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}