package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_460 {
    private final Production82_460 production = new Production82_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}