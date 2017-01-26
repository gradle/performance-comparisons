package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_460 {
    private final Production45_460 production = new Production45_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}