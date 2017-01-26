package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_460 {
    private final Production35_460 production = new Production35_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}