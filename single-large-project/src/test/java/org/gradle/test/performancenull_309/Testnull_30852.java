package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30852 {
    private final Productionnull_30852 production = new Productionnull_30852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}