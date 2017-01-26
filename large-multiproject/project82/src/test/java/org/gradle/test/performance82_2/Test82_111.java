package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_111 {
    private final Production82_111 production = new Production82_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}