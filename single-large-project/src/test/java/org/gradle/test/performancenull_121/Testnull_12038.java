package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12038 {
    private final Productionnull_12038 production = new Productionnull_12038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}