package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_119 {
    private final Production82_119 production = new Production82_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}