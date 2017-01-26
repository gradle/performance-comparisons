package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30526 {
    private final Productionnull_30526 production = new Productionnull_30526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}