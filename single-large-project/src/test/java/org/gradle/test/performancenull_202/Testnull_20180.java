package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20180 {
    private final Productionnull_20180 production = new Productionnull_20180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}