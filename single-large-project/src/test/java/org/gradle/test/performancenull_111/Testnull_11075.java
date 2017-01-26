package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11075 {
    private final Productionnull_11075 production = new Productionnull_11075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}