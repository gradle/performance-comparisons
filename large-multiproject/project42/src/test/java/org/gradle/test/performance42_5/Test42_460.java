package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_460 {
    private final Production42_460 production = new Production42_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}