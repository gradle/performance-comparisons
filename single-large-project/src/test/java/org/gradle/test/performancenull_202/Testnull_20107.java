package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20107 {
    private final Productionnull_20107 production = new Productionnull_20107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}