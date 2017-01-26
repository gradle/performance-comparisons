package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_460 {
    private final Production60_460 production = new Production60_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}