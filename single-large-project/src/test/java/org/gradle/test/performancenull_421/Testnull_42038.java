package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42038 {
    private final Productionnull_42038 production = new Productionnull_42038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}