package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_460 {
    private final Production9_460 production = new Production9_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}