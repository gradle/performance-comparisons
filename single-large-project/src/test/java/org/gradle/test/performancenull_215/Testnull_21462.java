package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21462 {
    private final Productionnull_21462 production = new Productionnull_21462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}