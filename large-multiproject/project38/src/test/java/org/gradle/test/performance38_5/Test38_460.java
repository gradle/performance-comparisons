package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_460 {
    private final Production38_460 production = new Production38_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}