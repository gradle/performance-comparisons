package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_460 {
    private final Production95_460 production = new Production95_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}