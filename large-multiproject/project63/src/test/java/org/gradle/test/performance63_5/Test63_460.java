package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_460 {
    private final Production63_460 production = new Production63_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}