package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10935 {
    private final Productionnull_10935 production = new Productionnull_10935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}