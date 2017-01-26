package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_166 {
    private final Production82_166 production = new Production82_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}