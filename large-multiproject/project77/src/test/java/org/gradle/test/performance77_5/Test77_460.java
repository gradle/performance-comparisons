package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_460 {
    private final Production77_460 production = new Production77_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}