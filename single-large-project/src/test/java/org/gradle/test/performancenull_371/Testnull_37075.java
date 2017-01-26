package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37075 {
    private final Productionnull_37075 production = new Productionnull_37075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}