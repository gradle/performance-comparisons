package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_147 {
    private final Production82_147 production = new Production82_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}