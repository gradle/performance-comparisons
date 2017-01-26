package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_460 {
    private final Production69_460 production = new Production69_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}