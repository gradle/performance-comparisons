package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20157 {
    private final Productionnull_20157 production = new Productionnull_20157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}