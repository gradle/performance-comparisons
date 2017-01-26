package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_460 {
    private final Production17_460 production = new Production17_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}