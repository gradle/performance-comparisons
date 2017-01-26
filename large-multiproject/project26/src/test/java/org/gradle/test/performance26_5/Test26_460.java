package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_460 {
    private final Production26_460 production = new Production26_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}