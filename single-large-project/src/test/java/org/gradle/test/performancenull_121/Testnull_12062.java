package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12062 {
    private final Productionnull_12062 production = new Productionnull_12062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}