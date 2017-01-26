package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_460 {
    private final Production72_460 production = new Production72_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}