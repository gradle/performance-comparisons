package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_460 {
    private final Production24_460 production = new Production24_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}