package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1641 {
    private final Productionnull_1641 production = new Productionnull_1641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}