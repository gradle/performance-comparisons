package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_230 {
    private final Production82_230 production = new Production82_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}