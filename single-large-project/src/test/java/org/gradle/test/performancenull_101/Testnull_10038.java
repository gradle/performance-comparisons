package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10038 {
    private final Productionnull_10038 production = new Productionnull_10038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}