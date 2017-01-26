package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10981 {
    private final Productionnull_10981 production = new Productionnull_10981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}