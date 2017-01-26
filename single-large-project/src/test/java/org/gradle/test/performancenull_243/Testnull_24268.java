package org.gradle.test.performancenull_243;

import static org.junit.Assert.*;

public class Testnull_24268 {
    private final Productionnull_24268 production = new Productionnull_24268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}