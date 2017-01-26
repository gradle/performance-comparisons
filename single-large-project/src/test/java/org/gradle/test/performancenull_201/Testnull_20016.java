package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20016 {
    private final Productionnull_20016 production = new Productionnull_20016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}