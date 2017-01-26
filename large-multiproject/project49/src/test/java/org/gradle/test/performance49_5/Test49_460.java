package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_460 {
    private final Production49_460 production = new Production49_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}