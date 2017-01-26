package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23038 {
    private final Productionnull_23038 production = new Productionnull_23038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}