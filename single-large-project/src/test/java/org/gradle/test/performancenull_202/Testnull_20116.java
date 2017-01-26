package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20116 {
    private final Productionnull_20116 production = new Productionnull_20116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}