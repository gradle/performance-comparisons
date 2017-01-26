package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_331 {
    private final Production82_331 production = new Production82_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}