package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20137 {
    private final Productionnull_20137 production = new Productionnull_20137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}