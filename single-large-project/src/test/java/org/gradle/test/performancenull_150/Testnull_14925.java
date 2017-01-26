package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14925 {
    private final Productionnull_14925 production = new Productionnull_14925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}