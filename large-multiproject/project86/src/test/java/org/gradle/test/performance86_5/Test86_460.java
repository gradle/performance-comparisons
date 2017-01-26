package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_460 {
    private final Production86_460 production = new Production86_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}