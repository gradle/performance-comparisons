package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_460 {
    private final Production96_460 production = new Production96_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}