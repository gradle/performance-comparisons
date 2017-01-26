package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48435 {
    private final Productionnull_48435 production = new Productionnull_48435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}