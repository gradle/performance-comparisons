package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_460 {
    private final Production30_460 production = new Production30_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}