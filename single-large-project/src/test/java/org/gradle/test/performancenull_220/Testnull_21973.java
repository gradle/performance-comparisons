package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21973 {
    private final Productionnull_21973 production = new Productionnull_21973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}