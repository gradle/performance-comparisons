package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42766 {
    private final Productionnull_42766 production = new Productionnull_42766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}