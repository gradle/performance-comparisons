package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_460 {
    private final Production22_460 production = new Production22_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}