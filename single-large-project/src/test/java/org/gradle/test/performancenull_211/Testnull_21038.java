package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21038 {
    private final Productionnull_21038 production = new Productionnull_21038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}