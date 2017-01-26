package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_460 {
    private final Production37_460 production = new Production37_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}