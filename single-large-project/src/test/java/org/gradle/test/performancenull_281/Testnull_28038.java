package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28038 {
    private final Productionnull_28038 production = new Productionnull_28038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}