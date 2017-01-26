package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_93 {
    private final Production82_93 production = new Production82_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}