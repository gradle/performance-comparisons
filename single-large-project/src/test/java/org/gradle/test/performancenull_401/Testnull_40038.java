package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40038 {
    private final Productionnull_40038 production = new Productionnull_40038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}