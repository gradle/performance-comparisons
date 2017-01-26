package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_460 {
    private final Production67_460 production = new Production67_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}