package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39906 {
    private final Productionnull_39906 production = new Productionnull_39906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}