package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49931 {
    private final Productionnull_49931 production = new Productionnull_49931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}