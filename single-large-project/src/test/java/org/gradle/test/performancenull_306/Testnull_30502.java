package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30502 {
    private final Productionnull_30502 production = new Productionnull_30502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}