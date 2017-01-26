package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20038 {
    private final Productionnull_20038 production = new Productionnull_20038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}