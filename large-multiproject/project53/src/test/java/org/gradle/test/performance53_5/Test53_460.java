package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_460 {
    private final Production53_460 production = new Production53_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}