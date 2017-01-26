package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_207 {
    private final Production82_207 production = new Production82_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}