package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20188 {
    private final Productionnull_20188 production = new Productionnull_20188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}