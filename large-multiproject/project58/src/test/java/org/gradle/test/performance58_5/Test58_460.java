package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_460 {
    private final Production58_460 production = new Production58_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}