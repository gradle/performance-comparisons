package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_460 {
    private final Production68_460 production = new Production68_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}