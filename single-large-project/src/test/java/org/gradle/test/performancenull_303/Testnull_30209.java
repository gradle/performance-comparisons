package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30209 {
    private final Productionnull_30209 production = new Productionnull_30209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}