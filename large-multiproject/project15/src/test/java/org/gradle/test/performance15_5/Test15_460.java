package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_460 {
    private final Production15_460 production = new Production15_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}