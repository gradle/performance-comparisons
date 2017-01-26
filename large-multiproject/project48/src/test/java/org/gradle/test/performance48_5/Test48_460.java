package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_460 {
    private final Production48_460 production = new Production48_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}