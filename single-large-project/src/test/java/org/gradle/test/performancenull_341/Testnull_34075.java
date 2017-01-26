package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34075 {
    private final Productionnull_34075 production = new Productionnull_34075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}