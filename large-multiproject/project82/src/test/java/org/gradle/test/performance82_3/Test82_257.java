package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_257 {
    private final Production82_257 production = new Production82_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}