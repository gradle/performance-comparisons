package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_460 {
    private final Production39_460 production = new Production39_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}