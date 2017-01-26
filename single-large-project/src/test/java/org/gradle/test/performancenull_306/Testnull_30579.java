package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30579 {
    private final Productionnull_30579 production = new Productionnull_30579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}