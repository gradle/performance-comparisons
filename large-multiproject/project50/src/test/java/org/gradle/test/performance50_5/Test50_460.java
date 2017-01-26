package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_460 {
    private final Production50_460 production = new Production50_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}