package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30188 {
    private final Productionnull_30188 production = new Productionnull_30188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}