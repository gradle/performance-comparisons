package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33791 {
    private final Productionnull_33791 production = new Productionnull_33791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}