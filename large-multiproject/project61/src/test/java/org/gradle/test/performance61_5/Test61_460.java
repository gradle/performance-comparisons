package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_460 {
    private final Production61_460 production = new Production61_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}