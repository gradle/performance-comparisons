package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39969 {
    private final Productionnull_39969 production = new Productionnull_39969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}