package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20200 {
    private final Productionnull_20200 production = new Productionnull_20200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}