package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20183 {
    private final Productionnull_20183 production = new Productionnull_20183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}