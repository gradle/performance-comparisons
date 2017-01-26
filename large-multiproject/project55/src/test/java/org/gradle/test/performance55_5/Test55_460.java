package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_460 {
    private final Production55_460 production = new Production55_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}