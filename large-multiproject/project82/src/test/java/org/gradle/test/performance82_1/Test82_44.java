package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_44 {
    private final Production82_44 production = new Production82_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}