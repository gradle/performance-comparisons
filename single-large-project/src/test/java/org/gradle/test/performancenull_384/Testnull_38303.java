package org.gradle.test.performancenull_384;

import static org.junit.Assert.*;

public class Testnull_38303 {
    private final Productionnull_38303 production = new Productionnull_38303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}