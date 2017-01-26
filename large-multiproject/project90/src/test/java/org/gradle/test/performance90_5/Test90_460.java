package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_460 {
    private final Production90_460 production = new Production90_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}