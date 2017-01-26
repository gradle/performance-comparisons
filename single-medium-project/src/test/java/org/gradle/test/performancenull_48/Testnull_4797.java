package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4797 {
    private final Productionnull_4797 production = new Productionnull_4797("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}