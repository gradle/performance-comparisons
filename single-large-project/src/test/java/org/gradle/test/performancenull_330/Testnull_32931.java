package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32931 {
    private final Productionnull_32931 production = new Productionnull_32931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}