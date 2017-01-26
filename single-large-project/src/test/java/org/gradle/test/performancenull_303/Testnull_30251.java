package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30251 {
    private final Productionnull_30251 production = new Productionnull_30251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}