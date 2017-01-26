package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_460 {
    private final Production97_460 production = new Production97_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}