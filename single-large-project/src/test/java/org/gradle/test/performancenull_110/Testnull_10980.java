package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10980 {
    private final Productionnull_10980 production = new Productionnull_10980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}