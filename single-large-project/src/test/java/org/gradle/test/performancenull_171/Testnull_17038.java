package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17038 {
    private final Productionnull_17038 production = new Productionnull_17038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}