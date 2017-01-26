package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14063 {
    private final Productionnull_14063 production = new Productionnull_14063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}