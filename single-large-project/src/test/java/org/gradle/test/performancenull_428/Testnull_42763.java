package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42763 {
    private final Productionnull_42763 production = new Productionnull_42763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}