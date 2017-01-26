package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30580 {
    private final Productionnull_30580 production = new Productionnull_30580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}