package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_460 {
    private final Production47_460 production = new Production47_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}