package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_460 {
    private final Production5_460 production = new Production5_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}