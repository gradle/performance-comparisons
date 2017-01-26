package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10966 {
    private final Productionnull_10966 production = new Productionnull_10966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}