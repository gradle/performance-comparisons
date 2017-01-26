package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_460 {
    private final Production21_460 production = new Production21_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}