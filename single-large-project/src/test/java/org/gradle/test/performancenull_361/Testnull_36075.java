package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36075 {
    private final Productionnull_36075 production = new Productionnull_36075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}