package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_460 {
    private final Production12_460 production = new Production12_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}