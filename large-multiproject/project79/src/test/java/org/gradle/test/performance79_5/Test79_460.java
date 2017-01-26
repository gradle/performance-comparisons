package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_460 {
    private final Production79_460 production = new Production79_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}