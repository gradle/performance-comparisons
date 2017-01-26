package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_460 {
    private final Production98_460 production = new Production98_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}