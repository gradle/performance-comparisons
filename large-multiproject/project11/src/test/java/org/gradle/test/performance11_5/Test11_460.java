package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_460 {
    private final Production11_460 production = new Production11_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}