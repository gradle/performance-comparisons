package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_460 {
    private final Production85_460 production = new Production85_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}