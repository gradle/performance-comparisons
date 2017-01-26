package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_460 {
    private final Production31_460 production = new Production31_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}