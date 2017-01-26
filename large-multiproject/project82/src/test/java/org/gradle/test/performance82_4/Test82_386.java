package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_386 {
    private final Production82_386 production = new Production82_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}