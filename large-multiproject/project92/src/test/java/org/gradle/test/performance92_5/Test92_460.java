package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_460 {
    private final Production92_460 production = new Production92_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}