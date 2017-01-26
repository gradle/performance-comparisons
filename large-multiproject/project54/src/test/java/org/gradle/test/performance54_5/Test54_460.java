package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_460 {
    private final Production54_460 production = new Production54_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}