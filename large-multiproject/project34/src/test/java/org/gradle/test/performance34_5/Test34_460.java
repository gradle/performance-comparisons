package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_460 {
    private final Production34_460 production = new Production34_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}