package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_460 {
    private final Production80_460 production = new Production80_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}