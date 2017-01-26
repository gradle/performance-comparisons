package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_460 {
    private final Production28_460 production = new Production28_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}