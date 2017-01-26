package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_460 {
    private final Production75_460 production = new Production75_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}