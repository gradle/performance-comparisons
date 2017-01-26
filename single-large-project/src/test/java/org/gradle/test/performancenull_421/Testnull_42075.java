package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42075 {
    private final Productionnull_42075 production = new Productionnull_42075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}