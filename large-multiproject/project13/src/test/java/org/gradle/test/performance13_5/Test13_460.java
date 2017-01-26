package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_460 {
    private final Production13_460 production = new Production13_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}