package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_460 {
    private final Production29_460 production = new Production29_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}