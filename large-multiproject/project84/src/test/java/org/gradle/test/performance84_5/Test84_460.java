package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_460 {
    private final Production84_460 production = new Production84_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}