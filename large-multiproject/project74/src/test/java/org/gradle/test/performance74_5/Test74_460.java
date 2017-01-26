package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_460 {
    private final Production74_460 production = new Production74_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}