package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20152 {
    private final Productionnull_20152 production = new Productionnull_20152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}