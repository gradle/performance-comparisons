package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_460 {
    private final Production7_460 production = new Production7_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}