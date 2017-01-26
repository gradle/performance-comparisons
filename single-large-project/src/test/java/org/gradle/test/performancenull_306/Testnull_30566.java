package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30566 {
    private final Productionnull_30566 production = new Productionnull_30566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}