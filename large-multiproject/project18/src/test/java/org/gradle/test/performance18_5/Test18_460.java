package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_460 {
    private final Production18_460 production = new Production18_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}