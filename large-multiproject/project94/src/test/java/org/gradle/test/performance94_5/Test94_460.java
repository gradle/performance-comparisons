package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_460 {
    private final Production94_460 production = new Production94_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}