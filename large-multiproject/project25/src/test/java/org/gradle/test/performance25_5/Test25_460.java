package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_460 {
    private final Production25_460 production = new Production25_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}