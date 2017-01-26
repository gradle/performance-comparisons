package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42709 {
    private final Productionnull_42709 production = new Productionnull_42709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}