package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_460 {
    private final Production43_460 production = new Production43_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}