package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_297 {
    private final Production82_297 production = new Production82_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}